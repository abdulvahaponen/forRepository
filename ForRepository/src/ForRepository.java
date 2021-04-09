public class ForRepository {
public static void main(String[] args) {
	//standart kullaným
	System.out.println("i: ");
	for (int i = 0; i <10; i++) {
		System.out.println(i+" ");
	}
	//azaltarak kullaným
	
	System.out.println("/nj:");
	for (int j= 10; j >=0; j--) {
		System.out.println(j+" ");
	}
	//5ten  10 a kadar kullaným
	System.out.println("/nk:");
	for(int k=5;k<=10;k++) {
		System.out.println(k+" ");
	}
	//0 dan 100e 10ar 10ar
	System.out.println("/nl:");
	for(int l=0;l<=100;l+=10) {
		System.out.println(l+" ");
	}
	//50den 0a5er 5er
	System.out.println("/n m:");
	for(int m=50;m>=0;m-=5) {
		System.out.println(m+" ");
	}
	for(int i=0;i<10;i++) {
		for(int j=10;j>0;j--) {
			System.out.println("i:"+i+"j:"+j);
		}
	}
	
}
}
