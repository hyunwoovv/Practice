--한줄 주석
/* 범위주석*/
SELECT
    * --모든 컬럼
FROM
    emp;
-- sql developer 자동 정렬 단축기 : ctrl + f7
SELECT
    empno,
    ename,
    deptno -- 조회하고 싶은 컬럼 명들
FROM
    emp;
    
    select * from dept;
    select*from salgrade;
    
    select deptno from emp;
    
    --한줄 복사 단축기 :ctrl + shift + d
    select distinct deptno from emp;
    select distinct job from emp;
    
    select deptno, job from emp;
    -- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는 걸 제거한다.
    
    --distinct : select에서 중복되는 자료를 제거해준다.
    --distinct가 뒤에 나오는 deptno, job에 영향을 미쳐서 두가지가 동시에 중복되는 것들중 하나만보여줌
      select distinct deptno, job from emp;
      
      
      -- null과 연산하면 무조건null이다.
      select ename, sal, sal*12+comm, comm from emp;
      
      --컬럼명에 별칭 사용
      --"생략가능
      --as 생략가능
      --별칭 안에 띄어쓰기가 있는 경우 " 생략 불가
      -- 가능하면 띄어쓰기보다 _를 넣자.
      select ename, sal, sal*12+comm as "new_Sal", comm from emp;
      
      --order by : 해당 컬럼으로 정렬
      -- 오름차순 :asc 생략 가능
      --내림차순 : desc
      select*from emp
      order by sal;
      
       select*from emp
      order by comm;
      
      select* from emp
      order by sal desc;
      
    --order by 첫 번째 거로 정렬 하고
    --그 중에 같은게 있다면 다음 거로 정렬 하고
    --그중에 같은게 있다면 다음거로 정렬 한다.
      select*from emp
      order by deptno asc, sal desc;
      
       select distinct job from emp
       order by job asc;
       
       select*from emp
       where sal >=2000
       order by sal;
       
       select * from emp
       where ename='KING';
       
       select*from emp
       where deptno = 30
       and job='SALESMAN';
       
       select* from emp
       where job = 'CLERK' and (deptno =30 or deptno=20);
       
       select*from emp
       where sal>=2000 and sal<3000;
       
       select*from emp
       --where sal !=3000; !=는 개발자들이 쓰는 코드이며 sql에서는 <>를 사용
       where sal<>3000;
       
       select*from emp
       where not (sal>=2000 and sal <3000);
       
       select*from emp
       where job in('MANAGER','SALESMAN','CLERK');
       
     select*from emp
       where job not in('MANAGER','SALESMAN','CLERK');
       
       select * from emp
       where sal >=2000 and sal <=3000;
       
       select* from emp
       where sal between 2000 and 3000;
       
       --%는 어떤거든 관계없음
       select*from emp
       where ename like 'S%';
       
       
       --_는 딱 한 글자인데 어떤 글자던 관계 없음
       select*from emp
       where ename like '_L%';
       
       select*from emp
       where ename like'%AM%';
       
       --null이 빠진 이유는 연산 처리가 안되기 때문에 값이 나올 수 없음.
       select*from emp
       where comm<=400;
       
       select*from emp
       where comm=null;
       
       --null만 특별하게 표시 해 주는 것 is null
         select*from emp
       where comm is null;--is not null도 있음
       
       select deptno, empno, ename, sal from emp
       where deptno=10 OR deptno =20;--where deptno in(10,20);도 가능
       
       --서로 다른 조회 결과물을 합쳐준다.
       -- 단, 조회한 컬럼의 타입, 개수가 같아야 한다.
       select deptno, empno, ename, sal from emp
       where deptno = 10
       union
       select deptno, empno, ename, sal from emp
       where deptno = 20;
       
       --union은 중복 자료를 제거해줌
       select deptno, empno, ename, sal from emp
       where deptno = 10
       union
       select deptno, empno, ename, sal from emp
       where deptno = 10;
       
       -- union all : 중복에 관계없이 합쳐준다
        select deptno, empno, ename, sal from emp
       where deptno = 10
       union all
       select deptno, empno, ename, sal from emp
       where deptno = 10;
       
       --1
       select*from emp
       where ename like '%S' ;
       
       --2
       select empno, ename, job, sal, deptno from emp
       where deptno=30 and job = 'SALESMAN';
       
       --3
     select empno, ename, job, sal, deptno from emp
     where (deptno =20 or deptno=30)--deptno in(20, 30)
     and sal>2000;
     
     -- 3-1
     select empno, ename, job, sal, deptno from emp
     where deptno= 20 and sal>2000
     union
     select empno, ename, job, sal, deptno from emp
     where deptno=30 and sal>2000;
     
     --4 
     select * from emp
     where not(sal>=2000 and sal<=3000);
     
     --5 
     select ename, empno, sal, deptno from emp
     where deptno= 30 and sal not between 1000 and 2000;
     
     --6
     select*from emp
     where comm is null and ename not like '_L%' and mgr is not null 
     and job = 'MANAGER'
     union
       select*from emp
     where comm is null and ename not like '_L%' and mgr is not null 
     and job = 'CLERK';
     --번외
        select*from emp
     where comm is null and ename not like '_L%' and mgr is not null 
     and job in('MANAGER', 'CLERK')
     order by job;
     
     select ename, upper(ename), lower(ename), initcap(ename)
     from emp;
     
     -- upper, lower는 대 소문자 구분 없이 like 할때 딱 좋다
     select * from emp
     where upper(ename) like upper('%Mi%');
     
     select ename, length(ename) from emp
     where length(ename)>=5;
     
     --dual : 임시 테이블
     select length('한글'), lengthb('한글') from dual;
     
     --substr : 대상이 되는 문자, 시작 위치, 가져올 개수
     -- 가져올 개수를 안쓰거나, 너무 크면 끝까지
     select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5),
     ename,
     substr(job, -3, 2),
     --큰 숫자가 뒤에 들어가면 뒤에있는 모든 글자를 보여줌.
     
     --length 문자 개수
    length( lower(substr(job, 5, 100)))
     from emp;
     
    select job, length(job), (length(job)+1)/2, 
    replace (job, substr(job,(length(job)+1)/2,1),'*') from emp;
    
    --lpad : 대상이 되는 문자, 전체 자리수, 채울 문자.
    -- 채울 문자 생략시 공백 문자.
    select 
    job,
    lpad(job, 10,'#'),
    lpad(job, 4, '#')
    from emp;

    select job, length(job), 
    15-length(job)
    from emp;
    
select
    rpad(
        lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*'
        ),
            
        (16 - (length(job)))/2 + length(lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*')
        ),
        
        '*')
from emp;

-- 문자열 더하기
select empno || ename
from emp;

-- trim : 앞 뒤 공백 제거
-- 글씨 사이에 공백은 제거하지 않음
select
   '       a   b   c       ',
   trim('    a   b   c    ')
   from dual;
--실습
--select 
--'210621-1234567',
--'210621-1******',
--substr('210621-1234567',1,8)||'******',
--rpad('210621-3',14,'*'),
--rpad(substr('210621-1234567',1,8),length('210621-1234567'),'*')
--from dual;

--실습 문제 2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
-- 정답의 예 : ward > wa**
--쉬운 버전 : 앞 두글자 + '***'

select ename,rpad(lpad(ename,2),length(ename),'*')
from emp;

-- 실습 문제3
--앞글자 하나만
--ward > *ard, martin >  *artin

select

ename, lpad(substr(ename,2),length(ename),'*')
--ename, '*'||substr(ename,2)
from emp;



--실습 문제 4
--두번째 글씨만 *
--ward > w*rd

select

--ename, substr(ename,1,1)|| '*'||substr(ename,3)
ename, substr(ename,1,1)||lpad(substr(ename,3),length(ename)-1,'*')
--뒤 쪽 substr은 3 번째 글자부터 출력 하고, length(ename)-1,'*'은 길이에서 -1한 위치에 *을 삽입
--                                      length(ename)-1을 하면 substr(ename,3)보다 범위가 한 글자만큼 넓기 때문에
--                                       추가적인 공간을 채우기 위해 lpad성질을 이용하여 *이 왼쪽에 삽입
from emp;

--실습 문제 5
--가운데 글씨만 *
select

ename, substr(ename,1,(length(ename)/2)-0.5) ||'*'|| substr(ename,(length(ename)/2)+1.5) 
from emp;

select trunc(1234,5678),
 trunc(1234.5678,2),
 trunc(1234.5678,-2),
 trunc(-12.34)
from dual;

select

ceil(3.14),
floor(3.14),
ceil(-3.14),
floor(-3.14)

from dual;

-- sysdate : 지금 오라클 pc의 시간
-- 강사 pc는 9시간 차이 난다(영국 0시 기준 한국 +9시)
-- 날짜 정보 중 일부만 select로 표시 됨
select sysdate, sysdate+1, sysdate-1 from dual;

-- 컬럼에 +를 적으면 모두 숫자로 변경해서 적용
-- || 는 숫자도 문자로 적용

select to_char(sysdate+(9/24), 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') as 현재날짜시간
from dual;

select
 sysdate - to_date('2024-05-07','yyyy-mm-dd')
from dual;

select comm, nvl(comm, -1),
sal,
sal + comm,
sal + nvl(comm,0)
from emp;

select*from emp
where nvl(comm, 0)=0;

select

case
when comm is null then 
--'N/A'
0

--문자로 바꾸려면 to_char(comm)사용
--위에가 N/A면 밑에도 문자로 바꿔야하기 때문에 to_char사용
else comm
--else ''||comm

end new_comm
from emp;

--실습 1
select
empno,
rpad(substr(empno,1,2),length(empno),'*') as masking_empno,
ename,
rpad(substr(ename,1,1),length(ename),'*') as masking_ename
from emp
where length(ename)>=5 and length(ename)<6;



-- 실습 2
select empno, ename, sal,
trunc(sal/21.5,2) as Day_pay,
round((sal/21.5)/8,1) as Time_pay

from emp;

--실습 3
select
empno,ename,
to_char(hiredate,'yyyy/mm/dd')as hiredate,
to_char(add_months(hiredate,3),'yyyy/mm/dd') as r_job
, comm
from emp;

select
empno, ename, mgr,
case
when mgr is null then to_char('0000')
when substr(mgr,1,2)=75 then to_char(5555)
when substr(mgr,1,2)=76 then to_char(6666)
when substr(mgr,1,2)=77 then to_char(7777)
when substr(mgr,1,2)=78 then to_char(8888)
else to_char(mgr)
end as chg_mgr
from emp;

--pad 이용
select
empno, ename, mgr,
case
when mgr is null then to_char('0000')
when lpad(mgr,2)=75 then to_char(5555)
when lpad(mgr,2)=76 then to_char(6666)
when lpad(mgr,2)=77 then to_char(7777)
when lpad(mgr,2)=78 then to_char(8888)
else to_char(mgr)
end as chg_mgr
from emp;

--count는 셀의 갯수를 세어줌.
--count는 *을 많이 줌
select sum(sal),count(sal), count(*),count(comm) from emp;

select count(*) from emp where ename like'%A%';

select max(sal), max(ename), min(hiredate),min(comm),avg(sal) from emp;

--부서별 급여 총합, 평균 표시
--deptno, sum, avg
select
sum(sal),
avg(sal)
from emp
where deptno=10
union all
select
sum(sal),
avg(sal)
from emp
where deptno=20
union all
select
sum(sal),
avg(sal)
from emp
where deptno=30;

--distinct처럼 중복을 제거해줌, 분류해줌.
--select
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
group by deptno, job
order by deptno, job    ;

--having : group by 에서만 사용된다.
-- 집계함수를 조건으로 걸고 싶을 때 사용

select deptno, job, avg(sal)
from emp
group by deptno, job
--    having avg(sal)>=2000
--having count(*) >=2;
having deptno = 20;

-- 실습 1
select
deptno, round(avg(sal),1) as avg_sal, max(sal) as max_sal ,min(sal) as min_sal,count(*) as cnt
from emp
group by deptno;

select
job,count(*)
from emp
group by job
having count(job)>=3;

select job, count(*)
from emp
group by job
having count(*) >=3;

select * from dept;

select job, count(*) cnt
from emp
where sal >1000
group by job
having count(*)>=3
order by cnt desc;   
 
select * from emp, dept order by empno;

select 14 * 4 from dual;

select emp.ename, /*emp.loc 는 존재하지 않음 */dept.loc, /*deptno*/ emp.deptno
from emp, dept
where emp.deptno=dept.deptno
order by empno;
-- 테이블 두개 이상 조회할 때 관계를 꼭 알려줘야 원하는 정보만 출력된다.
-- 전체 테이블 수 -1개의 조건이 적당하다.

select * from emp e, dept d
--where e.deptno=d.deptno;
where e.deptno=d.deptno;

select ename, emp.*from emp;

select * from salgrade;

select *
from emp e, salgrade s
where e.sal>=s.losal and e.sal <=s.hisal;

select * from emp;

select
e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

--using에 둘 다 같은 컬럼명이 있는 경우만 쓸 수 있다.
select * from emp join dept using(deptno);

select * from dept;


select * from
emp join dept on (emp.deptno=dept.deptno);

select * from emp e1 join emp e2 on(e1.mgr = e2.empno);

--left outer join 이란? 왼쪽 테이블을 모두 출력하는걸 보장해준다.
select * from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);


-- empno, ename, dname, loc 출력 : 결과물 14줄

select emp.empno, emp.ename, dept.dname, dept.loc from emp, dept
where emp.deptno=dept.deptno;

--join 사용한 방법
select e.empno, e.ename, d.dname, d.loc from
emp e join dept d on(e.deptno=d.deptno);

--using까지 이용
select empno, ename, dname, loc
from emp join dept using(deptno);



--사번, 이름, 부서명, 급여등급을 출력 :결과 14줄
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno=d.deptno
and e.sal>=s.losal and e.sal <= s.hisal;

--using  사용
select e.empno, e.ename, d.dname, s.grade
from salgrade s, emp e join dept d using(deptno)
where (e.sal>=s.losal and e.sal <= s.hisal);

--left outer join   사용
select e.empno, e.ename, d.dname, s.grade
from emp e
left outer join dept d on(e.deptno=d.deptno)
left outer join salgrade s on(e.sal>=s.losal and e.sal <= s.hisal);

--quiz 3
--매니저 보다 월급이 높은 사원의 이름, 급여, 매니저 이름과, 매니저 급여
--select*from emp;
select
e1.ename, e1.sal, e2.ename, e2.sal
from emp e1 join emp e2 on(e1.mgr = e2.empno) /*e1.mgr을 사용해서 상사의 번호와 e2.mgr을 사용해서
상사 본인의 번호가 일치하는 것을 찾고, e1.sal을 사용해서 본인의 월급, e2.sal을 사용해서 상사의 월급 비교*/
where e1.sal>e2.sal;

-- 실습 1
--급여가 2000초과인 사원들의 부서 정보, 사원정보
select
e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e join dept d on(e.deptno=d.deptno)
where e.sal>2000
order by e.deptno;

--실습 2
-- 부서별 평균 급여, 최대급여, 최소급여, 사원수
select

e.deptno, d.dname, floor(avg(e.sal)) as avg_sal, max(e.sal) as max_sal, min(e.sal) as min_sal, count(*) as cnt

from emp e join dept d on (e.deptno=d.deptno)

group by d.dname, e.deptno
order by e.deptno;

-- 방법 2
select d.deptno, d.dname, floor(avg(e.sal)) as avg_sal, max(e.sal) as max_sal, min(e.sal) as min_sal, count(*) as cnt
from emp e left outer join dept d on (e.deptno=d.deptno)
group by d.deptno, d.dname;

-- 실습 3
-- 모든 부서 정보와 사원 정보
select

dept.deptno, dept.dname, emp.empno, emp.ename, emp.job, emp.sal

from emp right outer join dept on(emp.deptno=dept.deptno)

order by emp.deptno, emp.ename;

--select * from dept;
--select * from emp;

select sal from emp where ename='JONES';

select * from emp
where sal>(select sal from emp where ename='JONES');

select * from emp
where emp.sal>(select avg(sal) from emp);

select*from emp
where sal>(select sal from emp where ename='BLAKE');

select * from emp
where job = (select job from emp where ename='JONES');

select * from emp
where sal in(
select max(sal) from emp group by deptno);

select * from(
select * from emp where deptno =10);

--rownum : where에서 쓰일 때는 전달인자가 하나씩 취급을 하여 한번에 하나씩만 처리하기 때문에 where에서 rownum은 쓸 수 없음.
-- select가 rownum보다 늦게 출력됨.
-- order by 로 쓰면 값이 섞인 이유는 먼저 rownum으로 값이 나온 상태에서 정렬을 하게 되기 때문.
-- order by 가 늦게 처리
select rownum, emp.*
from emp
order by ename;  

select rownum, e.*
--정렬이 되어 있는 것을 select 하기 때문에 이름순으로 정렬하고 rownum을 후에 적용시키기 위한 방식.
from(
select*from emp order by ename)e; 

select job, count(*) from emp
group by job
having count(*)>=3;

select * from (select job, count(*) cnt from emp group by job)
where cnt >=3;

with e10 as(select*from emp where deptno =10)
select * from e10;

--문제 1
select emp.job, emp.empno, emp.ename, emp.sal, dept.deptno, dept.dname from emp, dept
where emp.deptno=dept.deptno and job =(select job from emp where ename='ALLEN');

select * from emp;
select * from dept;
select * from salgrade;
--문제 2 
--전체사원의 평균 급여보다 높은 급여를 받는 사원들의 사원 정보, 부서 정보, 급여 등급 정보
select e.empno, e.ename, d.dname, to_char(e.hiredate,'yyyy-mm-dd')as hiredate, d.loc, e.sal, s.grade
from emp e, dept d, salgrade s
where e.deptno=d.deptno and e.sal >= s.losal and e.sal<=s.hisal
and e.sal > (select avg(sal) from emp)
order by sal desc,empno;

-- 문제 3
select e.empno, e.ename, e.job, e.deptno, d.dname, d.loc 
from emp e join dept d on (e.deptno=d.deptno)
where e.deptno=10 and e.job not in(select job from emp e where e.deptno=30);


--문제 4 직책이 salesman인 사람들의 최고 급여보다 높은 급여를 받는 사원들의 정보, 급여등급 정보
select e.empno, e.ename, e.sal, s.grade 
from emp e, salgrade s
where e.sal >= s.losal and e.sal<=s.hisal and e.sal>(select max(sal) from emp e where job='SALESMAN');

-------------------------12 장
create table emp_ddl(
empno number(4), --숫자 4자리
ename varchar2(10), -- 10 바이트
job varchar2(9), --제한보다 적은 글씨가 적히면 글씨 만큼의 공간만 차지
mgr number(4),
hiredate date,
sal number(7,2), --2는 소수점 둘째자리까지 기록할 수 있다.
comm number(7,2),
deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

create table dept_ddl
as select * from dept;

select * from dept_ddl;

create table emp_ddl_30
as select empno, ename, sal from emp where deptno=30;

select * from emp_ddl_30;

select * from emp
where 1 ^=1;

create table emp_alter
as select * from emp;

select*from emp_alter;

alter table emp_alter
add hp varchar2(20);

alter table emp_alter
rename column hp to tel;

-- 크기가 커지는 건 가능(줄어드는 건 불가능)
alter table emp_alter
modify empno number(6);/*4를 삽입하면 안됨*/

desc emp_alter;

alter table emp_alter
drop column tel;

select*from emp_alter;

alter table emp_alter        
drop column comm;

select*from emp_alter;

rename emp_alter to emp_rename;

select*from emp_rename;

truncate table emp_rename;

drop table emp_rename;

--10장
create table dept_temp
as select * from dept;

select * from dept_temp;

insert into dept_temp(loc, dname, deptno)
values ('SEOUL', 'DATABASE', 50);
select * from dept_temp;


--테이블 명 뒤에 ()를 생략하면 모든 컬럼
insert into dept_temp
values(60, 'network','Busan');

--''도 null로 보이는데 그래도 null이라고 쓰기
-- java에서 읽을 때 ''는 null로 인식하지 않기 때문에/
insert into dept_temp
values(80, 'mobile','');

insert into dept_temp
values(70,'Computer','ASAN');

--컬럼을 생략하면 자동으로 null이 들어간다
insert into dept_temp(deptno, loc)
values(90, '인천');

select *from dept_temp where loc is null;

create table emp_temp
as select * from emp;

select * from emp_temp;

insert into emp_temp(empno, ename, hiredate)
values (9999,'홍길동','2001/01/02');

insert into emp_temp (empno, ename, hiredate)
values(1111, '성춘향', '2001-02-03');

insert into emp_temp(empno, ename, hiredate)
values(2111, '이순신', to_date('2002-03-04','yyyy-mm-dd'));

insert into emp_temp (empno, ename, hiredate)
values (3111, '심청이', sysdate);

insert into emp_temp
select*from emp where deptno = 10;

select*from emp_temp;

create table dept_temp2
as select * from dept;

select*from dept_temp2;

update dept_temp2
set loc = 'seoul';

rollback;

--update 하기 전에 select로 where 조건이 정확한지 확인하고
--where를 그대로 복사해서 update에 붙여넣도록 하자
update dept_temp2
set loc = 'SEOUL', dname='DATAbase'
where deptno=40;

select *from dept_temp2
where deptno =40;

create table emp_temp2
as select * from emp;

select*from emp_temp2;

select*from emp_temp2
where job = 'MANAGER';

delete emp_temp2
where job ='MANAGER';

-- emp_temp2에서
-- 급여가 1000이하인 사원의 급여를
-- 급여를 3%인상 하시오

select ename, sal, sal*1.03 from emp_temp2
where sal<=1000;

update emp_temp2
set sal=sal*1.03
where sal <=1000;

delete emp_temp2;
select * from emp_temp2;

rollback;

select * from dict;

--index 색인
create index idx_emp_sal
on emp(sal);

select*from user_indexes;

drop index idx_emp_sal;

select * from emp
order by sal;


--강제 hint
select /* +index(idx_emp_sal)*/
*from emp e
order by sal;

-- plan
--sql developer 상단 세번째 아이콘 "계획설명"
create index idx_emp_empno_desc
on emp(empno desc);

create table emp_temp3
as select*from emp;

select max(empno)+1 as empno  from emp_temp3;

insert into emp_temp3(empno, ename)
values((select max(empno)+1 as empno  from emp_temp3),'신입이3');

select*from emp_temp3;

create table tb_user(
user_id number,
user_name varchar2(30)
);
select*from tb_user;

create sequence seq_user;

select seq_user.nextval from dual;
select seq_user.currval from dual;

insert into tb_user(user_id, user_name)
values(seq_user.nextval,'유저명2');
insert into tb_user(user_id, user_name)
values(seq_user.nextval,'유저명3');

create sequence seq_test
start with 10000 --시작 숫자 (기본 값 : 1)
increment by 100; -- 증감 숫자(기본값 : 1)

--nextval을 한번도 사용하지 않은 경우 currval사용 못함
select seq_test.currval from dual;
select seq_test.nextval from dual;

--primary key , pk, 주요키, 중요키, 기본키
-- not null +unique 조건(null허용 x , 유일해야함)
-- 생성과 동시에 index도 생성해줌.
--create table에서는 primary key 를 딱 하나만 지정
-- 두 개 이상의 컬럼을 primary key 지정 하려면 alter`    
create table table_pk(
login_id varchar2(20) primary key,
login_pwd varchar2(20) not null,
tel varchar2(20)
);

insert into table_pk(login_id, login_pwd, tel)
values(null, null, null);
insert into table_pk(login_id, login_pwd, tel)
values('id', null, null); --id와 pw 는 비워둘 수 없음
insert into table_pk(login_id, login_pwd, tel)
values('id', 'pw', null);--id와 pw는 두번 삽입할 수 없음
insert into table_pk(login_id, login_pwd, tel)
values('id', 'pw', null);--id와 pw는 두번 삽입할 수 없음



create table table_pk3(
login_id varchar2(20),
login_pwd varchar2(20),
tel varchar2(20),

primary key (login_id, login_pwd)
);

select*from user_constraints
where table_name = 'TABLE_PK3';

insert into table_pk3
values('id1','pw1',null);
insert into table_pk3
values('id2','pw2',null);
select*from table_pk3;

select*from user_constraints
where table_name = 'TABLE_PK';

select * from user_indexes;

create table dept_fk(
deptno1 number primary key,
dname varchar2(14));

--foreign key fk, 외래기, 참조키
--대상이 되는 테이블의 컬럼과 같은 타입으로 지정해야 한다
--컬럼명은 서로 달라도 관계 없다(보통 같게 한다)
-- 대상이 되는 컬럼은 pk여야 한다.
create table emp_fk (
empno number primary key,
ename varchar2(10),
deptno number references dept_fk(deptno1)
--deptno number references dept_fk --만약 컬럼명이 같다면 컬럼명 생략 가능
);

create table emp_fk2(
empno number primary key,
ename varchar2(10),
deptno number,
foreign key(deptno) references dept_fk(deptno1)
);

insert into dept_fk
values(100,'1강의실');

insert into emp_fk
values(1,'이름',101);-- dept에 101이 없어서 에러
insert into emp_fk
values(1,'이름',100);

update emp_fk set deptno=101;
update dept_fk set deptno=101;--이것도 안됨. emp_fk에서 100을 참조하고 있어서 수정, 삭제 불가
delete dept_fk;
truncate table dept_fk;

delete emp_fk;
update dept_fk set deptno1=101;

--1번문제
select rpad(substr(empno,1,2),length(empno),'*') as empno, ename  
from emp
order by empno desc;


--2번 문제.
-- join사용
select e.empno, e.ename, d.dname, d.loc
from emp e left outer join dept d on(e.deptno = d.deptno)
 order by d.dname desc;

-- where 활용
select e.empno, e.ename, d.dname, d.loc
from emp e, dept d
where e.deptno=d.deptno
order by d.dname desc;

