package stackOverflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// This is a hackerrank problem appeared in march sprint code week.
public class KarpenkarProblem  {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n1 = br.readLine();
		String n2= br.readLine();
		long num1= Long.parseLong(n1);
		long num2=Long.parseLong(n2);
		int count=0;
		for(long i=num1;i<=num2;i++){
			long prod=i*i;
			String prodStr=String.valueOf(prod);
			int len=prodStr.length();
			if(len<=2){
				if(getSum(prod)==i){
				System.out.print(i+" ");	
				}
			}
			else if(len>2){
				String part1,part2;
				if(len%2==0)
				{
					part1=prodStr.substring(0, len/2);
					part2=prodStr.substring((len/2));
				}
				else{
					part1=prodStr.substring(0, ((len/2))>0?((len/2)):1);
					part2=prodStr.substring(len/2);
				}

				long sumPart1=Long.parseLong(part1);
				long sumPart2=Long.parseLong(part2);

				if(sumPart1+sumPart2==i){
					System.out.print(i+" ");
					count++;
				}

			}
			
		}
		if(count==0){
			System.out.println("INVALID RANGE");
		}

	}


	private static long getSum(long parseLongNum) {
		long sum=0,k;
		while(parseLongNum!=0){
			k=parseLongNum%10;
			sum+=k;
			parseLongNum=parseLongNum/10;
		}
		return sum;


	}
}
