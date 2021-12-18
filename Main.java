class Main {
public static void main(String[] args) {
    char foodType=  'V';
    int unitPrice1 = 7;
    int unitPrice2= 17;
   		int quantityOrdered = 1;
		int distance = 3;
		int finalBill = 0;
		if ( foodType == 'N' && distance>0 && quantityOrdered>=1)
		{
		    finalBill = unitPrice1*quantityOrdered;
		    System.out.println(+finalBill);
		}
		else if ( foodType == 'V' && distance>0 && quantityOrdered>=1)
		{
		    finalBill = unitPrice2*quantityOrdered;
		    System.out.println(+finalBill);
		}
		else 
		{
		    System.out.println("-1");
		}
		}
	}
