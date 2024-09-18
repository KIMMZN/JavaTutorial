package _04_Random_0814_R;

public class _07_Random {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jobTime ={40,32,4,16,5,8};
		int jobUseNum = 0;  //작업실을 사용하는 사람의 번호
		int jobUseTotalycount = jobTime.length; // 작업실을 사용하는 사람의 전체 인원수
		int useTime=4;  // 작업실 사용 시간
		int finishJobycount=0; //작업을 완료한 사람의 인원수
		for(;;) {
			if(jobTime[jobUseNum] > 0) {   // 남은 작업이 있다면 작업실을 사용하시오
				System.out.print(jobUseNum+"사용중 / ");
				jobTime[jobUseNum] -= useTime;  // 4시간 차감
				System.out.println(jobTime[jobUseNum]+" 남았습니다.");
				if(jobTime[jobUseNum] <= 0 ){  //작업이 완료 되었는지 확인
					System.out.println("*" + jobUseNum +"이용을 완료하였습니다.");
					finishJobycount++;
				}
				if(finishJobycount == jobUseTotalycount ) {   // 모든 사람이 작업을 완료하였는지?
					break;
				}			
			}
			// 다음 사람 지정  시작 -->
			jobUseNum ++;
			jobUseNum = jobUseNum%jobUseTotalycount;
			//  <-- 다음 사람 지정 끝
			System.out.println(jobUseNum +" 차례입니다.");
		}
	}

}