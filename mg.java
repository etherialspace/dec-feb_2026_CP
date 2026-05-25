	public class mergesort
	{
		public static void mergeSort(int[] arr,int low ,int high)
		{
			if(low<high)
			{
				int mid=low+(high-low)/2;
				mergeSort(arr,low,mid);
				mergeSort(arr,mid+1,high);
				merge(array,low,mid,high);
			}
		}
		public static void merge(int[] arr,int low,int mid,int high)
		{
			int n1=mid-low+1;
			int n2=high-mid;
			int[] left_arr=new int[n1];
			int[] right_arr=new int[n2];
			for(int i=0;i<n1;i++)
				left_arr[i]=arr[left+i];
			for(int j=0;j<n;j++)
				right_arr[i]=right_arr[mid+j+1];
			int i=0,j=0,k=low;
			while(i<n1&&j<n2)
			{
				if(left_arr[i]<right_arr[j])
				{
					arr[k++]=left_arr[i++];
				}
				else
				{
					arr[k++]=right_arr[j++];
				}
			}
			while(i<n1)
				arr[k++]=left_arr[i++];
			while(j<n2)
				arr[k++]=right_arr[j++];
		}
		public static void main(String[] args)
		{
			int[] arr={2,5,4,3,1,2,7,4,2,1};
			int high=arr.length()-1;
			mergeSort(arr,0,high);
			for(int i:arr)
			{
				System.out.println(i+'\n');
			}
		}
	}