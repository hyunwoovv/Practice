--���� �ּ�
/* �����ּ�*/
SELECT
    * --��� �÷�
FROM
    emp;
-- sql developer �ڵ� ���� ����� : ctrl + f7
SELECT
    empno,
    ename,
    deptno -- ��ȸ�ϰ� ���� �÷� ���
FROM
    emp;
    
    select * from dept;
    select*from salgrade;
    
    select deptno from emp;
    
    --���� ���� ����� :ctrl + shift + d
    select distinct deptno from emp;
    select distinct job from emp;
    
    select deptno, job from emp;
    -- �÷��� �������� ��� �÷����� ������ �ߺ��Ǵ� �� �����Ѵ�.
    
    --distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�.
    --distinct�� �ڿ� ������ deptno, job�� ������ ���ļ� �ΰ����� ���ÿ� �ߺ��Ǵ� �͵��� �ϳ���������
      select distinct deptno, job from emp;
      
      
      -- null�� �����ϸ� ������null�̴�.
      select ename, sal, sal*12+comm, comm from emp;
      
      --�÷��� ��Ī ���
      --"��������
      --as ��������
      --��Ī �ȿ� ���Ⱑ �ִ� ��� " ���� �Ұ�
      -- �����ϸ� ���⺸�� _�� ����.
      select ename, sal, sal*12+comm as "new_Sal", comm from emp;
      
      --order by : �ش� �÷����� ����
      -- �������� :asc ���� ����
      --�������� : desc
      select*from emp
      order by sal;
      
       select*from emp
      order by comm;
      
      select* from emp
      order by sal desc;
      
    --order by ù ��° �ŷ� ���� �ϰ�
    --�� �߿� ������ �ִٸ� ���� �ŷ� ���� �ϰ�
    --���߿� ������ �ִٸ� �����ŷ� ���� �Ѵ�.
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
       --where sal !=3000; !=�� �����ڵ��� ���� �ڵ��̸� sql������ <>�� ���
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
       
       --%�� ��ŵ� �������
       select*from emp
       where ename like 'S%';
       
       
       --_�� �� �� �����ε� � ���ڴ� ���� ����
       select*from emp
       where ename like '_L%';
       
       select*from emp
       where ename like'%AM%';
       
       --null�� ���� ������ ���� ó���� �ȵǱ� ������ ���� ���� �� ����.
       select*from emp
       where comm<=400;
       
       select*from emp
       where comm=null;
       
       --null�� Ư���ϰ� ǥ�� �� �ִ� �� is null
         select*from emp
       where comm is null;--is not null�� ����
       
       select deptno, empno, ename, sal from emp
       where deptno=10 OR deptno =20;--where deptno in(10,20);�� ����
       
       --���� �ٸ� ��ȸ ������� �����ش�.
       -- ��, ��ȸ�� �÷��� Ÿ��, ������ ���ƾ� �Ѵ�.
       select deptno, empno, ename, sal from emp
       where deptno = 10
       union
       select deptno, empno, ename, sal from emp
       where deptno = 20;
       
       --union�� �ߺ� �ڷḦ ��������
       select deptno, empno, ename, sal from emp
       where deptno = 10
       union
       select deptno, empno, ename, sal from emp
       where deptno = 10;
       
       -- union all : �ߺ��� ������� �����ش�
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
     --����
        select*from emp
     where comm is null and ename not like '_L%' and mgr is not null 
     and job in('MANAGER', 'CLERK')
     order by job;
     
     select ename, upper(ename), lower(ename), initcap(ename)
     from emp;
     
     -- upper, lower�� �� �ҹ��� ���� ���� like �Ҷ� �� ����
     select * from emp
     where upper(ename) like upper('%Mi%');
     
     select ename, length(ename) from emp
     where length(ename)>=5;
     
     --dual : �ӽ� ���̺�
     select length('�ѱ�'), lengthb('�ѱ�') from dual;
     
     --substr : ����� �Ǵ� ����, ���� ��ġ, ������ ����
     -- ������ ������ �Ⱦ��ų�, �ʹ� ũ�� ������
     select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5),
     ename,
     substr(job, -3, 2),
     --ū ���ڰ� �ڿ� ���� �ڿ��ִ� ��� ���ڸ� ������.
     
     --length ���� ����
    length( lower(substr(job, 5, 100)))
     from emp;
     
    select job, length(job), (length(job)+1)/2, 
    replace (job, substr(job,(length(job)+1)/2,1),'*') from emp;
    
    --lpad : ����� �Ǵ� ����, ��ü �ڸ���, ä�� ����.
    -- ä�� ���� ������ ���� ����.
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

-- ���ڿ� ���ϱ�
select empno || ename
from emp;

-- trim : �� �� ���� ����
-- �۾� ���̿� ������ �������� ����
select
   '       a   b   c       ',
   trim('    a   b   c    ')
   from dual;
--�ǽ�
--select 
--'210621-1234567',
--'210621-1******',
--substr('210621-1234567',1,8)||'******',
--rpad('210621-3',14,'*'),
--rpad(substr('210621-1234567',1,8),length('210621-1234567'),'*')
--from dual;

--�ǽ� ���� 2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ������ �� : ward > wa**
--���� ���� : �� �α��� + '***'

select ename,rpad(lpad(ename,2),length(ename),'*')
from emp;

-- �ǽ� ����3
--�ձ��� �ϳ���
--ward > *ard, martin >  *artin

select

ename, lpad(substr(ename,2),length(ename),'*')
--ename, '*'||substr(ename,2)
from emp;



--�ǽ� ���� 4
--�ι�° �۾��� *
--ward > w*rd

select

--ename, substr(ename,1,1)|| '*'||substr(ename,3)
ename, substr(ename,1,1)||lpad(substr(ename,3),length(ename)-1,'*')
--�� �� substr�� 3 ��° ���ں��� ��� �ϰ�, length(ename)-1,'*'�� ���̿��� -1�� ��ġ�� *�� ����
--                                      length(ename)-1�� �ϸ� substr(ename,3)���� ������ �� ���ڸ�ŭ �б� ������
--                                       �߰����� ������ ä��� ���� lpad������ �̿��Ͽ� *�� ���ʿ� ����
from emp;

--�ǽ� ���� 5
--��� �۾��� *
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

-- sysdate : ���� ����Ŭ pc�� �ð�
-- ���� pc�� 9�ð� ���� ����(���� 0�� ���� �ѱ� +9��)
-- ��¥ ���� �� �Ϻθ� select�� ǥ�� ��
select sysdate, sysdate+1, sysdate-1 from dual;

-- �÷��� +�� ������ ��� ���ڷ� �����ؼ� ����
-- || �� ���ڵ� ���ڷ� ����

select to_char(sysdate+(9/24), 'yyyy"��" mm"��" dd"��" hh24"��" mi"��" ss"��"') as ���糯¥�ð�
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

--���ڷ� �ٲٷ��� to_char(comm)���
--������ N/A�� �ؿ��� ���ڷ� �ٲ���ϱ� ������ to_char���
else comm
--else ''||comm

end new_comm
from emp;

--�ǽ� 1
select
empno,
rpad(substr(empno,1,2),length(empno),'*') as masking_empno,
ename,
rpad(substr(ename,1,1),length(ename),'*') as masking_ename
from emp
where length(ename)>=5 and length(ename)<6;



-- �ǽ� 2
select empno, ename, sal,
trunc(sal/21.5,2) as Day_pay,
round((sal/21.5)/8,1) as Time_pay

from emp;

--�ǽ� 3
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

--pad �̿�
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

--count�� ���� ������ ������.
--count�� *�� ���� ��
select sum(sal),count(sal), count(*),count(comm) from emp;

select count(*) from emp where ename like'%A%';

select max(sal), max(ename), min(hiredate),min(comm),avg(sal) from emp;

--�μ��� �޿� ����, ��� ǥ��
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

--distinctó�� �ߺ��� ��������, �з�����.
--select
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
group by deptno, job
order by deptno, job    ;

--having : group by ������ ���ȴ�.
-- �����Լ��� �������� �ɰ� ���� �� ���

select deptno, job, avg(sal)
from emp
group by deptno, job
--    having avg(sal)>=2000
--having count(*) >=2;
having deptno = 20;

-- �ǽ� 1
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

select emp.ename, /*emp.loc �� �������� ���� */dept.loc, /*deptno*/ emp.deptno
from emp, dept
where emp.deptno=dept.deptno
order by empno;
-- ���̺� �ΰ� �̻� ��ȸ�� �� ���踦 �� �˷���� ���ϴ� ������ ��µȴ�.
-- ��ü ���̺� �� -1���� ������ �����ϴ�.

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

--using�� �� �� ���� �÷����� �ִ� ��츸 �� �� �ִ�.
select * from emp join dept using(deptno);

select * from dept;


select * from
emp join dept on (emp.deptno=dept.deptno);

select * from emp e1 join emp e2 on(e1.mgr = e2.empno);

--left outer join �̶�? ���� ���̺��� ��� ����ϴ°� �������ش�.
select * from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);


-- empno, ename, dname, loc ��� : ����� 14��

select emp.empno, emp.ename, dept.dname, dept.loc from emp, dept
where emp.deptno=dept.deptno;

--join ����� ���
select e.empno, e.ename, d.dname, d.loc from
emp e join dept d on(e.deptno=d.deptno);

--using���� �̿�
select empno, ename, dname, loc
from emp join dept using(deptno);



--���, �̸�, �μ���, �޿������ ��� :��� 14��
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno=d.deptno
and e.sal>=s.losal and e.sal <= s.hisal;

--using  ���
select e.empno, e.ename, d.dname, s.grade
from salgrade s, emp e join dept d using(deptno)
where (e.sal>=s.losal and e.sal <= s.hisal);

--left outer join   ���
select e.empno, e.ename, d.dname, s.grade
from emp e
left outer join dept d on(e.deptno=d.deptno)
left outer join salgrade s on(e.sal>=s.losal and e.sal <= s.hisal);

--quiz 3
--�Ŵ��� ���� ������ ���� ����� �̸�, �޿�, �Ŵ��� �̸���, �Ŵ��� �޿�
--select*from emp;
select
e1.ename, e1.sal, e2.ename, e2.sal
from emp e1 join emp e2 on(e1.mgr = e2.empno) /*e1.mgr�� ����ؼ� ����� ��ȣ�� e2.mgr�� ����ؼ�
��� ������ ��ȣ�� ��ġ�ϴ� ���� ã��, e1.sal�� ����ؼ� ������ ����, e2.sal�� ����ؼ� ����� ���� ��*/
where e1.sal>e2.sal;

-- �ǽ� 1
--�޿��� 2000�ʰ��� ������� �μ� ����, �������
select
e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e join dept d on(e.deptno=d.deptno)
where e.sal>2000
order by e.deptno;

--�ǽ� 2
-- �μ��� ��� �޿�, �ִ�޿�, �ּұ޿�, �����
select

e.deptno, d.dname, floor(avg(e.sal)) as avg_sal, max(e.sal) as max_sal, min(e.sal) as min_sal, count(*) as cnt

from emp e join dept d on (e.deptno=d.deptno)

group by d.dname, e.deptno
order by e.deptno;

-- ��� 2
select d.deptno, d.dname, floor(avg(e.sal)) as avg_sal, max(e.sal) as max_sal, min(e.sal) as min_sal, count(*) as cnt
from emp e left outer join dept d on (e.deptno=d.deptno)
group by d.deptno, d.dname;

-- �ǽ� 3
-- ��� �μ� ������ ��� ����
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

--rownum : where���� ���� ���� �������ڰ� �ϳ��� ����� �Ͽ� �ѹ��� �ϳ����� ó���ϱ� ������ where���� rownum�� �� �� ����.
-- select�� rownum���� �ʰ� ��µ�.
-- order by �� ���� ���� ���� ������ ���� rownum���� ���� ���� ���¿��� ������ �ϰ� �Ǳ� ����.
-- order by �� �ʰ� ó��
select rownum, emp.*
from emp
order by ename;  

select rownum, e.*
--������ �Ǿ� �ִ� ���� select �ϱ� ������ �̸������� �����ϰ� rownum�� �Ŀ� �����Ű�� ���� ���.
from(
select*from emp order by ename)e; 

select job, count(*) from emp
group by job
having count(*)>=3;

select * from (select job, count(*) cnt from emp group by job)
where cnt >=3;

with e10 as(select*from emp where deptno =10)
select * from e10;

--���� 1
select emp.job, emp.empno, emp.ename, emp.sal, dept.deptno, dept.dname from emp, dept
where emp.deptno=dept.deptno and job =(select job from emp where ename='ALLEN');

select * from emp;
select * from dept;
select * from salgrade;
--���� 2 
--��ü����� ��� �޿����� ���� �޿��� �޴� ������� ��� ����, �μ� ����, �޿� ��� ����
select e.empno, e.ename, d.dname, to_char(e.hiredate,'yyyy-mm-dd')as hiredate, d.loc, e.sal, s.grade
from emp e, dept d, salgrade s
where e.deptno=d.deptno and e.sal >= s.losal and e.sal<=s.hisal
and e.sal > (select avg(sal) from emp)
order by sal desc,empno;

-- ���� 3
select e.empno, e.ename, e.job, e.deptno, d.dname, d.loc 
from emp e join dept d on (e.deptno=d.deptno)
where e.deptno=10 and e.job not in(select job from emp e where e.deptno=30);


--���� 4 ��å�� salesman�� ������� �ְ� �޿����� ���� �޿��� �޴� ������� ����, �޿���� ����
select e.empno, e.ename, e.sal, s.grade 
from emp e, salgrade s
where e.sal >= s.losal and e.sal<=s.hisal and e.sal>(select max(sal) from emp e where job='SALESMAN');

-------------------------12 ��
create table emp_ddl(
empno number(4), --���� 4�ڸ�
ename varchar2(10), -- 10 ����Ʈ
job varchar2(9), --���Ѻ��� ���� �۾��� ������ �۾� ��ŭ�� ������ ����
mgr number(4),
hiredate date,
sal number(7,2), --2�� �Ҽ��� ��°�ڸ����� ����� �� �ִ�.
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

-- ũ�Ⱑ Ŀ���� �� ����(�پ��� �� �Ұ���)
alter table emp_alter
modify empno number(6);/*4�� �����ϸ� �ȵ�*/

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

--10��
create table dept_temp
as select * from dept;

select * from dept_temp;

insert into dept_temp(loc, dname, deptno)
values ('SEOUL', 'DATABASE', 50);
select * from dept_temp;


--���̺� �� �ڿ� ()�� �����ϸ� ��� �÷�
insert into dept_temp
values(60, 'network','Busan');

--''�� null�� ���̴µ� �׷��� null�̶�� ����
-- java���� ���� �� ''�� null�� �ν����� �ʱ� ������/
insert into dept_temp
values(80, 'mobile','');

insert into dept_temp
values(70,'Computer','ASAN');

--�÷��� �����ϸ� �ڵ����� null�� ����
insert into dept_temp(deptno, loc)
values(90, '��õ');

select *from dept_temp where loc is null;

create table emp_temp
as select * from emp;

select * from emp_temp;

insert into emp_temp(empno, ename, hiredate)
values (9999,'ȫ�浿','2001/01/02');

insert into emp_temp (empno, ename, hiredate)
values(1111, '������', '2001-02-03');

insert into emp_temp(empno, ename, hiredate)
values(2111, '�̼���', to_date('2002-03-04','yyyy-mm-dd'));

insert into emp_temp (empno, ename, hiredate)
values (3111, '��û��', sysdate);

insert into emp_temp
select*from emp where deptno = 10;

select*from emp_temp;

create table dept_temp2
as select * from dept;

select*from dept_temp2;

update dept_temp2
set loc = 'seoul';

rollback;

--update �ϱ� ���� select�� where ������ ��Ȯ���� Ȯ���ϰ�
--where�� �״�� �����ؼ� update�� �ٿ��ֵ��� ����
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

-- emp_temp2����
-- �޿��� 1000������ ����� �޿���
-- �޿��� 3%�λ� �Ͻÿ�

select ename, sal, sal*1.03 from emp_temp2
where sal<=1000;

update emp_temp2
set sal=sal*1.03
where sal <=1000;

delete emp_temp2;
select * from emp_temp2;

rollback;

select * from dict;

--index ����
create index idx_emp_sal
on emp(sal);

select*from user_indexes;

drop index idx_emp_sal;

select * from emp
order by sal;


--���� hint
select /* +index(idx_emp_sal)*/
*from emp e
order by sal;

-- plan
--sql developer ��� ����° ������ "��ȹ����"
create index idx_emp_empno_desc
on emp(empno desc);

create table emp_temp3
as select*from emp;

select max(empno)+1 as empno  from emp_temp3;

insert into emp_temp3(empno, ename)
values((select max(empno)+1 as empno  from emp_temp3),'������3');

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
values(seq_user.nextval,'������2');
insert into tb_user(user_id, user_name)
values(seq_user.nextval,'������3');

create sequence seq_test
start with 10000 --���� ���� (�⺻ �� : 1)
increment by 100; -- ���� ����(�⺻�� : 1)

--nextval�� �ѹ��� ������� ���� ��� currval��� ����
select seq_test.currval from dual;
select seq_test.nextval from dual;

--primary key , pk, �ֿ�Ű, �߿�Ű, �⺻Ű
-- not null +unique ����(null��� x , �����ؾ���)
-- ������ ���ÿ� index�� ��������.
--create table������ primary key �� �� �ϳ��� ����
-- �� �� �̻��� �÷��� primary key ���� �Ϸ��� alter`    
create table table_pk(
login_id varchar2(20) primary key,
login_pwd varchar2(20) not null,
tel varchar2(20)
);

insert into table_pk(login_id, login_pwd, tel)
values(null, null, null);
insert into table_pk(login_id, login_pwd, tel)
values('id', null, null); --id�� pw �� ����� �� ����
insert into table_pk(login_id, login_pwd, tel)
values('id', 'pw', null);--id�� pw�� �ι� ������ �� ����
insert into table_pk(login_id, login_pwd, tel)
values('id', 'pw', null);--id�� pw�� �ι� ������ �� ����



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

--foreign key fk, �ܷ���, ����Ű
--����� �Ǵ� ���̺��� �÷��� ���� Ÿ������ �����ؾ� �Ѵ�
--�÷����� ���� �޶� ���� ����(���� ���� �Ѵ�)
-- ����� �Ǵ� �÷��� pk���� �Ѵ�.
create table emp_fk (
empno number primary key,
ename varchar2(10),
deptno number references dept_fk(deptno1)
--deptno number references dept_fk --���� �÷����� ���ٸ� �÷��� ���� ����
);

create table emp_fk2(
empno number primary key,
ename varchar2(10),
deptno number,
foreign key(deptno) references dept_fk(deptno1)
);

insert into dept_fk
values(100,'1���ǽ�');

insert into emp_fk
values(1,'�̸�',101);-- dept�� 101�� ��� ����
insert into emp_fk
values(1,'�̸�',100);

update emp_fk set deptno=101;
update dept_fk set deptno=101;--�̰͵� �ȵ�. emp_fk���� 100�� �����ϰ� �־ ����, ���� �Ұ�
delete dept_fk;
truncate table dept_fk;

delete emp_fk;
update dept_fk set deptno1=101;

--1������
select rpad(substr(empno,1,2),length(empno),'*') as empno, ename  
from emp
order by empno desc;


--2�� ����.
-- join���
select e.empno, e.ename, d.dname, d.loc
from emp e left outer join dept d on(e.deptno = d.deptno)
 order by d.dname desc;

-- where Ȱ��
select e.empno, e.ename, d.dname, d.loc
from emp e, dept d
where e.deptno=d.deptno
order by d.dname desc;

