class Solution {
    
    // 상-하-좌-우
    int[] dx={-1, 1, 0, 0};
    int[] dy={0, 0, -1, 1};
    int[] dt={1, 0, 3, 2};
    
    boolean[][] con={
        {false, false, true, true}, 
        {true, true, false, false}, 
        {true, true, true, true}, 
        {true, false, true, false}, 
        {true, false, false, true}, 
        {false, true, false, true}, 
        {false, true, true, false}
    };
    
    boolean[][] train, visit;
    int[][] g;
    
    int answer=0, cnt=0, vcnt=0;
        
    public int solution(int[][] grid) {
        train=new boolean[grid.length][grid[0].length];
        visit=new boolean[grid.length][grid[0].length];
        g=new int[grid.length][grid[0].length];
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                g[i][j]=grid[i][j];
                if(grid[i][j]>0){
                    train[i][j]=true;
                    cnt++;
                }
            }
        }
        
        dfs(0, 0, 3, grid.length, grid[0].length);
        return answer;
    }
    
    // (x, y)에 방향 d로 진입
    void dfs(int x, int y, int d, int h, int w){
        if(x<0 || x>=h || y<0 || y>=w || g[x][y]==-1) return;
        
        int enter=dt[d];
        boolean empty=false;
        if(g[x][y]==0){
            empty=true;
        }
        
        int from=g[x][y];
        int to=g[x][y];
        if(empty){
            from=1;
            to=7;
        }
        
        for(int i=from; i<=to; i++){
            if(!con[i-1][enter]) continue;
            if(empty) g[x][y]=i;
            
            // 처음 방문
            boolean first=false;
            if(!visit[x][y]) first=true;
            visit[x][y]=true;
            // 원래 있던 선로
            boolean origin=false;
            if(first && train[x][y]) origin=true;
            if(origin) vcnt++;
            
            if(x==h-1 && y==w-1){
                // 도착
                boolean flag=true;
                // 원래 있던 선로 모두 지나감
                if(cnt!=vcnt) flag=false;
                
                for(int j=0; j<h; j++){
                    for(int z=0; z<w; z++){
                        if(!flag) continue;
                        if(g[j][z]!=3) continue;
                        
                        // 모든 3번 선로 연결
                        for(int k=0; k<4; k++){
                            int nx=j+dx[k], ny=z+dy[k];
                            if(nx<0 || nx>=h || ny<0 || ny>=w) flag=false;
                            else if(g[nx][ny]<=0) flag=false;
                            else if(!con[g[nx][ny]-1][dt[k]]) flag=false;
                        }
                    }
                }
                
                if(flag) answer++;
            } else{
                int e=d;
                if(i!=3){
                    for(int k=0; k<4; k++){
                        if(k!=enter && con[i-1][k]) e=k;
                    }
                }
                
                dfs(x+dx[e], y+dy[e], e, h, w);
            }
            
            if(first) visit[x][y]=false;
            if(origin) vcnt--;
            if(empty) g[x][y]=0;
        }   
    }
}
