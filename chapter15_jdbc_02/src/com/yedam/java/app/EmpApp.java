package com.yedam.java.app;

import java.sql.Date;
import java.util.*;

public class EmpApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		EmpDAO dao = EmpDAO.getInstance();

		while (run) {
			int menuNo = -1;
			System.out.println();
			System.out.println("===========================================================");
			System.out.println("= 1. 등록  2. 수정  3. 삭제  4. 사원조회  5. 사원전체조회  9. 종료 =");
			System.out.println("===========================================================");
			System.out.print("메뉴 선택: ");

			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("[ Error: 숫자만 입력해주세요. ]");
				sc.next();
				continue;
			}

			if (menuNo == 1) { // 1. 등록
				Emp emp = new Emp();
				System.out.print("이름: ");
				emp.setFirstName(sc.next());
				System.out.print("성: ");
				emp.setLastName(sc.next());
				System.out.print("이메일: ");
				emp.setEmail(sc.next());
				System.out.print("전화번호: ");
				emp.setPhoneNumber(sc.next());
				System.out.print("입사일: ");
				// yyyy-mm-dd (ps. java.util.Date -> yy/mm/dd)
				emp.setHireDate(Date.valueOf(sc.next()));
				System.out.print("직급: ");
				emp.setJobId(sc.next());
				System.out.print("연봉: ");
				emp.setSalary(sc.nextDouble());
				System.out.print("상여: ");
				emp.setCommissionPct(sc.nextDouble());
				System.out.print("상사: ");
				emp.setManagerId(sc.nextInt());
				System.out.print("부서: ");
				emp.setDepartmentId(sc.nextInt());

				dao.insertInfo(emp);
			} else if (menuNo == 2) { // 2. 수정
				Emp emp = new Emp();
				System.out.print("사원번호: ");
				emp.setEmployeeId(sc.nextInt());
				System.out.print("성: ");
				emp.setLastName(sc.next());

				dao.updateInfo(emp);
			} else if (menuNo == 3) { // 3. 삭제
				System.out.print("사원번호: ");
				int empId = sc.nextInt();

				dao.deleteInfo(empId);
			} else if (menuNo == 4) { // 4. 사원조회
				System.out.print("사원번호: ");
				int empId = sc.nextInt();
				Emp emp = new Emp();
				emp.setEmployeeId(empId);
				Emp findEmp = dao.selectInfo(emp);
				System.out.println(findEmp);

			} else if (menuNo == 5) { // 5. 사원전체조회
				List<Emp> list = dao.selectAll();
				for (Emp emp : list) {
					System.out.println(emp);
				}

			} else if (menuNo == 9) {
				System.out.println("[ 9. 종료 ]");
				run = false;

			} else {
				System.out.println("[ Error: 올바른 값을 입력해 주세요. ]");
			}

		}

		sc.close();
	} // main
} // class

//List<Emp> list = EmpDAO.getInstance().selectAll();
//for (Emp emp : list) {
//	System.out.println(emp);
//}
