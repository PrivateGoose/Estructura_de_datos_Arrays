import java.util.*;

public class Estructura_de_datos_Arrays {

    public static void main(String[] args) {
        
                System.out.println("Type an odd number: ");
		Scanner sc= new Scanner(System.in);
                
                int i;
		int N= sc.nextInt();		
		int[][] matrix= new int[N][N];		
		int column=(int) (Math.ceil( N/2));
                int queue=0;

		matrix[queue][column]=1;
                column=column+1;
		queue=N-1;
		
		for(i=2;i<=N*N;i++) {
			if(queue<0) {
			queue=N-1;
			}
                        else if(column==N){
			column=0;	
			}
                        
			if (i%N==0) {
			matrix[queue][column]=i;
			i=i+1;
			if(i>N*N) {
                            break;
			}
			queue=queue+1;
			matrix[queue][column]=i;
			}
			else{
			matrix[queue][column]=i;
			}
			queue=queue-1;
			column=column+1;	
		}
		for (int[] print_out : matrix) {
                    for (int p : print_out) { System.out.print(p + "\t"); 
                    } 
                    System.out.println("\n"); 	
		}
	}
}