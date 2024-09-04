create table stu(
no number,
name varchar2(5 char),
tel varchar2(13));

create table pp(
no number,
e_name varchar2(4),
e_point number(3));

insert into stu values (1,'hong', '1111');
insert into stu values (2,'kim', '2222');
insert into stu values (3,'lee', '3333');

insert into pp values(1, 'java',70);
insert into pp values(1, 'html',90);
insert into pp values(3, 'java',80);

desc stu;
select * from stu;
select * from pp;

drop table stu;
-- join : 1�� �̻��� ���̺��� �������� ��ġ�°�
-- ���� : full join : �ΰ��� ���̺��� ��� ��ġ�°�
--      ����� n*m�� ����ŭ ������ �Ǿ� Ʃ���� ����� ����.
--        inner join : ������ �����Ѵ�. ���ǿ� ���� ��츸 �����Ѵ�.
--              ����: �����̳�����(==), �񵿵��̳�����(!=)
--        outer join : �̳����� + ���ο� �������� ���� Ʃ�ñ��� ���
--              ����: ���̺� ������ ��ġ�� ����
--              left outer join, right outer join
--      ������ ������ : � ���̺��� �����ұ�? � ������ ����ұ�??
--  ���� full join�غ��� .. ���� ���������� ���� ������. �ӵ��� �ʹ� ������.
select *
from stu,pp;

 -- ���̺� ������: DROP TABLE stu CASCADE CONSTRAINTS;
 --Ǯ ����
select s.no, s.name, p.no, p.e_name, p.e_point
from stu s, pp p;

-- ���� �̳�����
select s.no, s.name, p.no, p.e_name, p.e_point
from stu s, pp p
where s.no=p.no;

-- ���� �̳������� ������ ���� ǥ����� �ִ�.
select s.no, s.name, p.no, p.e_name, p.e_point
from stu s      
inner join pp p     
on s.no=p.no;

--left �ƿ��� ����
select s.no, s.name, p.no, p.e_name, p.e_point
from stu s      
left outer join pp p     --left outer join/ left table : stu
on s.no=p.no;

-- right �ƿ��� ����
select s.no, s.name, p.no, p.e_name, p.e_point
from stu s      
right outer join pp p     --left outer join/ left table : stu
on s.no=p.no;


--�񵿵� �̳�����
select s.no, s.name, p.no, p.e_name, p.e_point
from stu s, pp p
where s.no!=p.no;

commit;

DROP TABLE stu CASCADE CONSTRAINTS;
DROP TABLE pp CASCADE CONSTRAINTS;

-- ������ �� �л����� �̸��� ����� ������ ����Ͻÿ�.
-- 2���� ���̺��� ���ľ� ���� // ���� .. �׷��� ���� Į���� ��ġ��
                            -- �̳�����                            
select s.name, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no;
--ȫ�浿�� �̸��� ����� ������ ����Ͻÿ�. �̳�����
select s.name, p.e_name, p.e_point
from stu s, pp p
where s.no = p.no and s.name='hong';
--������ ġ���� ���� �л����� �̸��� ����Ͻÿ�
-- �̳����ο� �������� ���� Ʃ���� �����̹Ƿ� �ƿ��� ����
-- 1. left outer join �ذ�
select s.name
from stu s
left outer join pp p
on s.no = p.no
where p.no is null;

// join ����
// ������ ����
// ������ ������ ���� ����ϴ��� ?? ���� ..



DROP TABLE users CASCADE CONSTRAINTS;


create table users(
id varchar2(8), 
name varchar2(10), 
addr varchar2(10));

create table carinfo(
c_num varchar2(4),   --�ڵ��� ��ȣ
c_name varchar2(10),  -- �ڵ��� ����
 id varchar2(8));


insert into users values ('1111','kim','����');
insert into users values ('2222','lee','����');
insert into users values ('3333','park','����');
insert into users values ('4444','choi','����');

insert into carinfo values ('1234','����','1111');
insert into carinfo values ('3344','����','1111');
insert into carinfo values ('5566','����','3333');
insert into carinfo values ('6677','����','3333');
insert into carinfo values ('7788','����','4444');
insert into carinfo values ('8888','����','5555');

select * from carinfo;
select * from users;

-- 1. ȸ���� �̸��� �ּҸ� ����Ͻÿ�.
select u.name �̸�, u.addr �ּ�
from users u;
--2. ȸ���� �̸��� ������ �ڵ��� ��ȣ�� ����Ͻÿ�. - �̳�����
select u.name �̸�, c.c_num �ڵ�����ȣ
from users u,carinfo c
where u.id = c.id;
--3. �ڵ��� ��ȣ�� 7788�� �������� �̸��� �ּҸ� ����Ͻÿ�.
select u.name �̸�, u.addr �ּ�, c.c_num �ڵ�����ȣ
from users u,carinfo c
where u.id = c.id and c.c_num = '7788';
--4. �ڵ����� �������� ���� ����� �̸��� �ּҸ� ����Ͻÿ�.
select u.name �̸�, u.addr �ּ�
from users u
left outer join carinfo c
on u.id = c.id
where c.id is null;
--5. ȸ���� ����� �ڵ��� ���� ����Ͻÿ�.
select u.name �̸�, count(*) �����_�ڵ���_��
from users u,carinfo c
where u.id = c.id
group by u.name;
--6. 2�� �̻��� ������ ȸ���� �̸��� ������ �ڵ��� ���� ����Ͻÿ�.
select u.name �̸�, count(*) �����_�ڵ���_��
from users u,carinfo c
where u.id = c.id 
group by u.name having count(*) >= 2;
--7. �ڵ����� ��ϵǾ� �ִµ� �����ڰ� ���� �ڵ��� ��ȣ�� ����Ͻÿ�.
select c.c_num as �����ڰ�_����_�ڵ�����ȣ
from users u
right outer join carinfo c
on u.id = c.id
where u.id is null;

--
create table companycar(     -- �ڵ��� ����
c_num varchar2(4),   -- ����ȣ
c_com varchar2(30),  -- ������
c_name varchar2(10),  -- ���̸�
c_price number);  -- �� ����

insert into companycar values ('1234','����','�ҳ�Ÿ',1000);
insert into companycar values ('3344','���','����',2000);
insert into companycar values ('7788','���','��2',800);
insert into companycar values ('9900','����','�׷���',2100);

--8. ���� �ڵ����� ����ȣ, ������, �ڵ�����, ������ ����Ͻÿ�.
select c_num, c_com, c_name, c_price
from companycar;

select * from companycar; --1234 3344 7788 9900 
select * from carinfo; -- 1234 3344 7788 ;; 5566 6677 8888 

select c.c_num ����ȣ, c.c_com ������, c.c_name �ڵ�����, c.c_price ����
from carinfo a, companycar c
where a.c_num = c.c_num;
-- 9. ȸ�翡�����Ŵ� �Ͽ����� �������� ���� �ڵ����� ����ȣ, ������, �ڵ��� �̸��� ���  
-- company���� �ִµ� carinfo���� ���� �ڵ���

select c.c_num ����ȣ, c.c_com ����ȸ��, c.c_name �ڵ����̸�
from carinfo a
right outer join companycar c
on a.c_num = c.c_num
where a.c_num is null;

--10. �ڵ��� ������ 1000���� �̻��� �ڵ����� �ڵ��� ��ȣ�� ����Ͻÿ�.

select c.c_num �ڵ�����ȣ
from companycar c
where c.c_price>1000;

--11. ������ �ڵ��� �߿� ȸ�翡�� ������ �ڵ����� �ƴ� �ڵ��� ��ȣ�� ����Ͻÿ�.
-- carinfo���� �ִµ� company���� ���� �ڵ���������

select a.c_num �ڵ�����ȣ
from carinfo a
left outer join companycar c
on a.c_num = c.c_num
where c.c_num is null;

--12. ��� ����� ������ ����Ͻÿ�. �̸�, �������� �ڵ�����ȣ, �ڵ����̸�
--
select * from companycar; --1234 3344 7788 9900 
select * from carinfo; -- 1234 3344 7788 ;; 5566 6677 8888 
select * from users;

select u.name �̸�, c.c_num �ڵ�����ȣ, c.c_name �ڵ����̸�
from carinfo a, companycar c, users u
where a.c_num = c.c_num
    and a.id = u.id;

