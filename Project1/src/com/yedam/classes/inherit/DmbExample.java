package com.yedam.classes.inherit;

public class DmbExample {

	public static void main(String[] args) {
/*		DmbCellPhone dcp = new DmbCellPhone("DMB","white",10);
		System.out.println(dcp.model);
		System.out.println(dcp.channel);
		dcp.powerOn();
		dcp.sendVoices("아아아아아");
		dcp.bell();
		dcp.receiveVoices("살려줘");
		dcp.turnOnDmb();
	dcp.changeChannel(5);
		dcp.turnOFFDmb();
		dcp.powerOFF(); */

	//	for(int i=0;i <10;i++) {
	//		for(int j=0; j<0 ; j++) {
	//			a[i] += ""+(i+1)+"x"+(j+1)+" = "+(i+1)*(j+1);
	//			System.out.println(a[i]);
				
	//		}
	//	}

int j= 1;

				for (int i = 1; i <= 10; i++) {
					
					
						System.out.print(i + " * " + j + " = " + (i * j) + " \t ");
					if(i ==9) {
						i=0;
						j++;
						System.out.println();
					}
					if(j==10) {
						break;
					}

				}
				

			}
		
	

}
