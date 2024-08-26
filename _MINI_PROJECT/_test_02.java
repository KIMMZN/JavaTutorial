package _MINI_PROJECT;

public class _test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] jobTime ={40,32,4,16,5,8};
		
		int jobuser = 0; //작업실을 사용하는 사람의 번호
		int jobusertotalNum = jobTime.length; // 작업실을 사용하는 사람의 전체 인원수
		int jobtime = 4; //작업실 사용시간
		
		//System.out.println("dd" + 1%6);
		
		int finishNum = 0;
		for(;;) {
			
			if(jobTime[jobuser] > 0) {
				System.out.println(jobuser +" " + "사용중");
				jobTime[jobuser] -= jobtime; // 4시간 -
				System.out.println(jobTime[jobuser] + " " + "시간 남았습니다.");
				if (jobTime[jobuser] <= 0 ) {
					System.out.println("!!"+ jobuser+ " " + "이용이 완료하였습니다.");
					finishNum++;
				}
				if (finishNum == jobusertotalNum) {
					break;
				}
			}
			jobuser ++;
			jobuser = jobuser%jobusertotalNum;
			//
			System.out.println(jobuser + " " + "차례 입니다." );
			
		}	
	}

}
