package array;

public class LargestNumber {
		static int aa[]={55,26,81,776,976,48,888,654,6666};
		static int largest()
		{
			int i;
			int max=aa[0];
			for (i=0;i<aa.length;i++)
				if(aa[i]>max)
					max=aa[i];
			return max;
		}
		public static void main(String[] args) {
			{
				System.err.println("the largest number in the given array is:"+largest());
			}
		}

	}

