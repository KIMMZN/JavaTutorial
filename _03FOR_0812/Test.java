package _03FOR_0812;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String a ="67/414/1/23/32/45/54/12/11/232";  
				int sum=0;
				String tempInt="";
				a=a+"/";
				
				for(int i=0; i< a.length(); i++) {
					char temp = a.charAt(i);
					if(temp != '/') {
						tempInt += temp;
						System.out.println("tempint:" +  tempInt);
					}else {
						int addInt = Integer.valueOf(tempInt);  
						System.out.println(addInt);
						sum += addInt;
						tempInt="";
					}
				}
				
				System.out.println(sum);
				System.out.println("tempinddt:" +  tempInt);

			}

		}