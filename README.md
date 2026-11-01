# 🧩 Algorithm Study

프로그래머스 · SWEA 문제를 함께 푸는 Java 알고리즘 스터디입니다. SQL 문제도 자유롭게 함께 올립니다.

- 📒 기록 노션: [Algorithm Study Notion](https://app.notion.com/p/ea3fecda353a827b9d5901a176de2f48)
- 💻 언어: Java, SQL
- 🏫 플랫폼: [프로그래머스](https://school.programmers.co.kr/learn/challenges), [SWEA](https://swexpertacademy.com/main/code/problem/problemList.do)

## 👥 멤버

- 김소영
- 김은혜
- 곽지영


## 📁 폴더 구조

- 프로그래머스: `PGS / 순서_문제이름 / Solution_이름.java`
- SWEA: `SWEA / 순서_문제번호_문제이름 / Solution_이름.java`
- SQL: `SQL / 문제폴더 / Solution_이름.sql`

순서는 플랫폼별로 `001`부터 매겨서, 이름순으로 정렬하면 푸는 순서대로 보입니다.

```
algorithm-study/
├── README.md
├── templates/                          # 풀이 시작용 템플릿
│   ├── PGS_Solution.java
│   ├── SWEA_Solution.java
│   └── SQL_Solution.sql
├── PGS/
│   ├── 001_기차선로/
│   │   ├── Solution_김은혜.java
│   │   ├── Solution_김소영.java
│   │   └── Solution_곽지영.java
│   ├── 002_제곱개수배열/
│   └── ...
├── SWEA/
│   ├── 001_1206_View/
│   │   ├── Solution_김은혜.java
│   │   ├── Solution_김소영.java
│   │   └── Solution_곽지영.java
│   ├── 002_1244_최대상금/
│   └── ...
└── SQL/
    └── 부서별_평균_연봉_조회하기/
        └── Solution_김은혜.sql
```



## 📌 규칙

### 진행 방식
1. 주차별로 풀이 문제 개수를 각자 정합니다(한 주에 최소 2문제 - 프로그래머스 1 + SWEA 1)
2. 각자 `templates/`의 템플릿을 복사해서 풀이를 작성합니다.
3. 풀이 상단 주석에 **접근 방법 / 시간복잡도 / 회고**를 간단히 남깁니다(선택사항).
4. 코드 작성 후 위 템플릿대로 올려 주차별 pr을 작성합니다.
5. 노션 문제풀이표에 풀이 날짜를 작성합니다.

### 커밋 규칙
- 커밋 메시지: `[분류|문제번호] 문제이름(Level) - 이름`
  - 예
    - `[PGS] 기차선로(Level 3) - 김은혜`
    - `[SWEA|1206] View(D3) - 김은혜`
    - `[SQL] 부서별 평균 연봉 조회하기(Level 3) - 김은혜`
- PR 제목: `[주차] 이름` (예: `[Week01] 김은혜`)