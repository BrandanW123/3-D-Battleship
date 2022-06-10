import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		
		boolean test1, test2;
		
		//Ships to it's own list
		List mylist = new ArrayList();
			
		mylist.add(2);
		mylist.add(3);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		
		// TODO Auto-generated method stub Array setup
		final int NUM_DIMI = 3; 
		final int NUM_ROWS = 12;
		final int NUM_COLS = 12;
		int[][][] numSpace = new int[NUM_DIMI][NUM_ROWS][NUM_COLS];
		
		//System.out.println("D " + "R "+ "C");
		
		//BEGINNING OF LOOP	/ CREATING ARRAY
		for(int i=0; i<NUM_DIMI; ++i) {
			for(int j=0; j<NUM_ROWS; ++j) {
				for(int k=0; k<NUM_COLS; ++k) {
					
					numSpace[i][j][k] = 0;
												}
											}
										}

		 	int rowNum = 0;
			int colNum = 0;
			int dimiNum = 0;
		
		
		//ASSIGN SPACE POSITIONING / CHECKING POSITIONS / PLACING BOATS IF TRUE
		
			int l = 0;
			while(l < 5) {
			test1= false;
			test2 = false;
			
			Random randGen = new Random();
			rowNum = randGen.nextInt(12);
			colNum = randGen.nextInt(12);
			dimiNum = randGen.nextInt(3);
			
			if(numSpace[dimiNum][rowNum][colNum] == 0) {
			
			if(12-colNum > (int)mylist.get(l)) {
				int tempCol = colNum; 
				while((tempCol < 11)&&(tempCol < colNum + (int)mylist.get(l))){
					if((numSpace[dimiNum][rowNum][tempCol] == 0)) { 
						test1 = true; 
						tempCol ++; 
					}
					else {
						test1 = false;
						break;
					}
				}
				if(test1==true) {
					for(int j = colNum;j < colNum + (int)mylist.get(l); ++j) {
						int index = l+1;
						
						numSpace[dimiNum][rowNum][j] = index;
					}
					l++;
				}
			}
			
			else if(12-rowNum > (int)mylist.get(l)) {
				int tempRow = rowNum; 
				while((tempRow < 11)&&(tempRow < rowNum + (int)mylist.get(l))){
					if((numSpace[dimiNum][tempRow][colNum] == 0)) {
						test2 = true; 
						tempRow ++; 
					}
					
					else {
						test2 = false;
						break;
					}
				}
				if(test2==true) {
					for(int j = rowNum;j < rowNum + (int)mylist.get(l); ++j) {
						int index = l+1;
						
						numSpace[dimiNum][j][colNum] = index;
					}
					l++;
					
				}
				
			}
								
			}
			}


//LINEAR SEARCH FOR BOATS
  int v = 0;
  
  for(int i=0; i<NUM_DIMI; ++i) {
			for(int j=0; j<NUM_ROWS; ++j) {
				for(int k=0; k<NUM_COLS; ++k) {

          if( numSpace[i][j][k] == 1 || numSpace[i][j][k] == 2 || numSpace[i][j][k] == 3 || numSpace[i][j][k] == 4 || numSpace[i][j][k] == 5){

	    	 System.out.println("Found " + numSpace[i][j][k] + " Level " + (i + 1) + " Row " + j + " Column " + k);
         numSpace[i][j][k] = 8;
         ++v;
	    }
      else if(v == 17){
        break;
      }
	    else{
	      
	      System.out.println("Missed at: " + "Level " + (i + 1) + " Row " + j + " Column " + k);
        numSpace[i][j][k] = 1;

	    }        
       }
      }
  }
 
  System.out.println();
			
		
		//PRINTING ARRAY	
			
		for(int i=0; i<NUM_DIMI; ++i) {
			System.out.println("Level: " + (i+1) );
			System.out.println();
			for(int j=0; j<NUM_ROWS; ++j) {
				for(int k=0; k<NUM_COLS; ++k) {
		
					System.out.print(numSpace[i][j][k] +" ");
												  }
				System.out.println("");
											}
			System.out.println("");
									   }
		
		

}


}