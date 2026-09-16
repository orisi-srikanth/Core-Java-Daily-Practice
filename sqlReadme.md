# SQL + DBMS — Complete Learning Roadmap

> **Goal:** Build strong SQL + DBMS fundamentals for Full Stack Developer interviews and coding assessments.

---

## 📌 Progress

### Day 1 — DBMS Foundations

* [x] What is a Database?
* [x] What is DBMS?
* [x] What is RDBMS?
* [x] Tables
* [x] Rows / Records / Tuples
* [x] Columns / Attributes
* [x] Schema
* [x] Instance

---

## 🔑 1. Keys

* [x] Super Key
* [x] Candidate Key
* [x] Primary Key
* [x] Alternate Key
* [x] Foreign Key
* [x] Composite Key
* [x] Natural Key
* [x] Surrogate Key
* [x] Key hierarchy
* [x] Key-based interview questions

### Key hierarchy

```text
SUPER KEY
    ↓
Remove unnecessary attributes
    ↓
CANDIDATE KEY
    ↓
Choose one
    ↓
PRIMARY KEY

Remaining candidate keys
    ↓
ALTERNATE KEYS
```

---

## 🛡️ 2. Constraints

* [x] What are constraints?
* [x] NOT NULL
* [x] UNIQUE
* [x] PRIMARY KEY
* [x] FOREIGN KEY
* [x] CHECK
* [x] DEFAULT
* [x] NULL vs 0 vs empty string
* [x] Referential integrity
* [x] Constraint combinations

---

## 🔢 3. Data Types

### Numeric

* [x] TINYINT
* [x] SMALLINT
* [x] INT
* [x] BIGINT
* [x] DECIMAL / NUMERIC
* [x] FLOAT
* [x] DOUBLE

### Character

* [x] CHAR
* [x] VARCHAR
* [x] TEXT

### Date / Time

* [x] DATE
* [x] TIME
* [x] DATETIME
* [x] TIMESTAMP

### Other

* [x] BOOLEAN
* [x] BINARY
* [x] VARBINARY
* [x] BLOB
* [x] NULL

---

# 🔗 4. Relationships

* [x] What is a relationship?
* [x] Cardinality
* [x] One-to-One (1:1)
* [x] One-to-Many (1:N)
* [x] Many-to-Many (M:N)
* [x] Junction / Associative table
* [x] Degree of relationship
* [x] Unary relationship
* [x] Binary relationship
* [x] Ternary relationship
* [x] Total participation
* [x] Partial participation
* [x] Relationship vs Foreign Key

---

# 🧩 5. ER Model

* [x] ER Model
* [x] Entity
* [x] Entity Type
* [x] Entity Instance
* [x] Entity Set
* [x] Attributes
* [x] Simple Attribute
* [x] Composite Attribute
* [x] Single-Valued Attribute
* [x] Multi-Valued Attribute
* [x] Stored Attribute
* [x] Derived Attribute
* [x] Strong Entity
* [x] Weak Entity
* [x] Owner Entity
* [x] Identifying Relationship
* [x] Key Attribute
* [x] Relationship Attribute
* [x] Generalization
* [x] Specialization
* [x] Associative Entity
* [x] ER Model → Relational Tables

---

# 🚀 TOMORROW — SQL

## 6. SQL Fundamentals

* [ ] What is SQL?
* [ ] SQL vs MySQL
* [ ] SQL vs DBMS vs RDBMS
* [ ] SQL command categories

  * [ ] DDL
  * [ ] DML
  * [ ] DQL
  * [ ] DCL
  * [ ] TCL

---

## 7. DDL — Data Definition Language

* [ ] CREATE DATABASE
* [ ] CREATE TABLE
* [ ] ALTER TABLE
* [ ] ADD column
* [ ] MODIFY column
* [ ] DROP column
* [ ] RENAME column
* [ ] RENAME table
* [ ] DROP TABLE
* [ ] TRUNCATE TABLE

### Must understand

```text
CREATE     → create structure
ALTER      → modify structure
DROP       → remove structure
TRUNCATE   → remove all rows
```

---

# 📥 8. DML — Data Manipulation Language

* [ ] INSERT
* [ ] UPDATE
* [ ] DELETE

### Practice

* [ ] Insert one row
* [ ] Insert multiple rows
* [ ] Update one row
* [ ] Update multiple rows
* [ ] Delete one row
* [ ] Delete multiple rows
* [ ] Understand WHERE with UPDATE/DELETE

---

# 🔍 9. DQL — SELECT

* [ ] SELECT
* [ ] SELECT specific columns
* [ ] SELECT *
* [ ] Column aliases
* [ ] DISTINCT
* [ ] Expressions in SELECT
* [ ] Arithmetic operations

Example:

```sql
SELECT name, salary
FROM Employee;
```

---

# 🎯 10. WHERE — Filtering

* [ ] =
* [ ] !=
* [ ] <>
* [ ] >
* [ ] <
* [ ] >=
* [ ] <=
* [ ] AND
* [ ] OR
* [ ] NOT
* [ ] IN
* [ ] NOT IN
* [ ] BETWEEN
* [ ] NOT BETWEEN
* [ ] LIKE
* [ ] NOT LIKE
* [ ] IS NULL
* [ ] IS NOT NULL

### LIKE patterns

```text
'A%'   → starts with A
'%A'   → ends with A
'%A%'  → contains A
'_A%'  → second character is A
```

---

# ↕️ 11. ORDER BY + LIMIT

* [ ] ORDER BY
* [ ] ASC
* [ ] DESC
* [ ] Sort by multiple columns
* [ ] LIMIT
* [ ] OFFSET
* [ ] Top-N problems

---

# 📊 12. Aggregate Functions

* [ ] COUNT()
* [ ] SUM()
* [ ] AVG()
* [ ] MIN()
* [ ] MAX()

### Important

Understand:

```text
COUNT(*)
COUNT(column)
COUNT(DISTINCT column)
```

Especially how `NULL` affects COUNT.

---

# 🧮 13. GROUP BY

* [ ] GROUP BY basics
* [ ] Grouping by one column
* [ ] Grouping by multiple columns
* [ ] Aggregate + GROUP BY
* [ ] WHERE vs GROUP BY

---

# 🔥 14. HAVING

* [ ] HAVING basics
* [ ] WHERE vs HAVING
* [ ] GROUP BY + HAVING
* [ ] Aggregate conditions

Remember:

```text
WHERE  → filters rows
HAVING → filters groups
```

---

# 🔗 15. JOINS — HIGH PRIORITY

> **Do not memorize JOIN syntax only. Understand why JOINs are required.**

* [ ] Why JOIN?
* [ ] Primary Key ↔ Foreign Key
* [ ] INNER JOIN
* [ ] LEFT JOIN
* [ ] RIGHT JOIN
* [ ] FULL OUTER JOIN concept
* [ ] SELF JOIN
* [ ] CROSS JOIN
* [ ] Multiple-table JOIN
* [ ] JOIN conditions
* [ ] JOIN + WHERE
* [ ] JOIN + GROUP BY
* [ ] JOIN + HAVING

### Must be able to explain

```text
INNER JOIN → matching rows
LEFT JOIN  → all left + matching right
RIGHT JOIN → all right + matching left
FULL JOIN  → everything from both sides
```

---

# 🧠 16. Subqueries

* [ ] What is a subquery?
* [ ] Scalar subquery
* [ ] Single-row subquery
* [ ] Multi-row subquery
* [ ] IN with subquery
* [ ] EXISTS
* [ ] NOT EXISTS
* [ ] Correlated subquery
* [ ] Subquery in SELECT
* [ ] Subquery in FROM
* [ ] Subquery in WHERE

### Practice problems

* [ ] Second-highest salary
* [ ] Employees earning above average salary
* [ ] Employees working in a particular department
* [ ] Departments having employees

---

# 🔀 17. Set Operations

* [ ] UNION
* [ ] UNION ALL
* [ ] INTERSECT
* [ ] EXCEPT
* [ ] Rules for combining result sets
* [ ] UNION vs UNION ALL

---

# 🧱 18. SQL Constraints — Practical

Implement everything using SQL:

* [ ] PRIMARY KEY
* [ ] FOREIGN KEY
* [ ] UNIQUE
* [ ] NOT NULL
* [ ] CHECK
* [ ] DEFAULT
* [ ] Named constraints
* [ ] Adding constraints
* [ ] Removing constraints

---

# 👁️ 19. Views

* [ ] What is a View?
* [ ] CREATE VIEW
* [ ] SELECT from View
* [ ] UPDATE View concept
* [ ] DROP VIEW
* [ ] View vs Table

---

# ⚡ 20. Indexes

* [ ] What is an Index?
* [ ] Why indexes improve lookup performance
* [ ] CREATE INDEX
* [ ] DROP INDEX
* [ ] Single-column index
* [ ] Composite index
* [ ] Unique index
* [ ] Index advantages
* [ ] Index disadvantages
* [ ] When NOT to use an index

---

# 💳 21. Transactions

* [ ] Transaction
* [ ] COMMIT
* [ ] ROLLBACK
* [ ] SAVEPOINT
* [ ] ACID properties

### ACID

```text
A → Atomicity
C → Consistency
I → Isolation
D → Durability
```

---

# 🧠 22. DBMS — Advanced Theory

* [ ] Data independence
* [ ] Logical data independence
* [ ] Physical data independence
* [ ] Three-schema architecture
* [ ] Data abstraction
* [ ] Database users
* [ ] Database administrator
* [ ] DBMS architecture

---

# 📐 23. Normalization

* [ ] Functional Dependency
* [ ] Partial Dependency
* [ ] Transitive Dependency
* [ ] 1NF
* [ ] 2NF
* [ ] 3NF
* [ ] BCNF
* [ ] 4NF — awareness
* [ ] 5NF — awareness
* [ ] Denormalization
* [ ] Normalization vs Denormalization

### Core idea

```text
1NF → Atomic values
2NF → Remove partial dependency
3NF → Remove transitive dependency
BCNF → Stronger candidate-key condition
```

---

# 🧮 24. SQL Functions

## String Functions

* [ ] CONCAT
* [ ] LENGTH
* [ ] LOWER
* [ ] UPPER
* [ ] TRIM
* [ ] SUBSTRING
* [ ] REPLACE

## Numeric Functions

* [ ] ROUND
* [ ] CEIL / CEILING
* [ ] FLOOR
* [ ] ABS
* [ ] MOD

## Date Functions

* [ ] CURRENT_DATE
* [ ] CURRENT_TIMESTAMP
* [ ] DATE functions
* [ ] Date difference
* [ ] Date arithmetic

---

# 🪟 25. CASE Expression

* [ ] CASE
* [ ] Simple CASE
* [ ] Searched CASE
* [ ] CASE with SELECT
* [ ] CASE with ORDER BY
* [ ] CASE with GROUP BY

Example:

```sql
SELECT name,
       CASE
           WHEN salary >= 100000 THEN 'HIGH'
           WHEN salary >= 50000 THEN 'MEDIUM'
           ELSE 'LOW'
       END AS salary_level
FROM Employee;
```

---

# 🪟 26. Window Functions

> Advanced but highly valuable for SQL interviews.

* [ ] What is a window function?
* [ ] OVER()
* [ ] PARTITION BY
* [ ] ORDER BY inside OVER()
* [ ] ROW_NUMBER()
* [ ] RANK()
* [ ] DENSE_RANK()
* [ ] LAG()
* [ ] LEAD()
* [ ] Running totals
* [ ] Top-N per group

---

# 🔄 27. CTE

* [ ] What is a CTE?
* [ ] WITH
* [ ] Single CTE
* [ ] Multiple CTEs
* [ ] CTE vs Subquery
* [ ] Recursive CTE — awareness

---

# ⚙️ 28. Stored Programs — Awareness

* [ ] Stored Procedure
* [ ] Stored Function
* [ ] Trigger
* [ ] Procedure vs Function
* [ ] Trigger use cases

---

# 🔐 29. Database Security

* [ ] Users
* [ ] Roles
* [ ] GRANT
* [ ] REVOKE
* [ ] Authentication vs Authorization
* [ ] SQL Injection awareness
* [ ] Parameterized queries / Prepared Statements

---

# 🎯 30. Interview SQL Practice

After learning the concepts, solve problems without looking at solutions.

## Beginner

* [ ] Find all employees
* [ ] Filter employees by salary
* [ ] Sort employees
* [ ] Find unique departments
* [ ] Find employees whose names start with A
* [ ] Find NULL values
* [ ] Count employees
* [ ] Find average salary

## Intermediate

* [ ] Department-wise employee count
* [ ] Department-wise average salary
* [ ] Departments with more than N employees
* [ ] Second-highest salary
* [ ] Third-highest salary
* [ ] Find duplicate records
* [ ] Remove duplicate records conceptually
* [ ] Employees earning above department average
* [ ] Employees without a department
* [ ] Departments without employees

## Advanced

* [ ] Top 3 salaries per department
* [ ] Highest salary in each department
* [ ] Nth highest salary
* [ ] Running total
* [ ] Rank employees by salary
* [ ] Find consecutive records
* [ ] Find missing values/sequences
* [ ] Complex multi-table JOIN
* [ ] Correlated subquery problems
* [ ] CTE-based problems
* [ ] Window-function problems

---

# 🧪 Final SQL + DBMS Checklist

Before considering SQL/DBMS complete, I should be able to:

* [ ] Design tables from a problem statement
* [ ] Identify entities and relationships
* [ ] Select appropriate keys
* [ ] Select appropriate data types
* [ ] Apply constraints
* [ ] Create tables
* [ ] Insert data
* [ ] Update data
* [ ] Delete data
* [ ] Retrieve data with SELECT
* [ ] Filter with WHERE
* [ ] Group with GROUP BY
* [ ] Filter groups with HAVING
* [ ] Sort with ORDER BY
* [ ] Use aggregate functions
* [ ] Explain and write JOINs
* [ ] Write subqueries
* [ ] Use UNION / UNION ALL
* [ ] Explain normalization
* [ ] Explain transactions and ACID
* [ ] Explain indexes
* [ ] Create and use views
* [ ] Write CTEs
* [ ] Write window functions
* [ ] Solve interview SQL problems
* [ ] Explain every query I write

---

# 🏁 Completion Standard

Do **not** mark a topic `[x]` merely because you watched/read it.

Mark it complete only when you can:

1. **Define it**
2. **Explain why it exists**
3. **Write the syntax**
4. **Use it in a real query**
5. **Dry-run the query**
6. **Identify common mistakes**
7. **Answer interview questions about it**

---

## 📅 Study Strategy

### Phase 1 — Fundamentals

DBMS → Keys → Constraints → Data Types → Relationships → ER Model

### Phase 2 — SQL Core

DDL → DML → SELECT → WHERE → ORDER BY → Aggregate → GROUP BY → HAVING

### Phase 3 — SQL Intermediate

JOINS → Subqueries → Set Operations → Views → Indexes → Transactions

### Phase 4 — DBMS Theory

Architecture → Data Independence → Functional Dependencies → Normalization → ACID

### Phase 5 — Advanced SQL

CASE → Functions → CTEs → Window Functions → Stored Procedures → Triggers

### Phase 6 — Interview

Query writing → Debugging → Output prediction → Optimization → Mock interviews

---

# 📊 Current Status

```text
DBMS Fundamentals    ████████████████████ 100%
Keys                 ████████████████████ 100%
Constraints          ████████████████████ 100%
Data Types           ████████████████████ 100%
Relationships        ████████████████████ 100%
ER Model             ████████████████████ 100%

SQL Core             ░░░░░░░░░░░░░░░░░░░░   0%
SQL Intermediate     ░░░░░░░░░░░░░░░░░░░░   0%
DBMS Advanced        ░░░░░░░░░░░░░░░░░░░░   0%
Advanced SQL         ░░░░░░░░░░░░░░░░░░░░   0%
Interview Practice   ░░░░░░░░░░░░░░░░░░░░   0%
```

> **Next session starts at: `6. SQL Fundamentals → DDL`**

---

## 🎯 Final Goal

**Don't just learn SQL syntax.**

The goal is to understand:

```text
Problem
   ↓
Identify Entities
   ↓
Design ER Model
   ↓
Choose Keys
   ↓
Apply Constraints
   ↓
Create Tables
   ↓
Insert Data
   ↓
Query Data
   ↓
JOIN / GROUP / FILTER
   ↓
Optimize
   ↓
Explain the solution in an interview
```

**Target:** SQL + DBMS confidence for Full Stack Developer placement interviews.
