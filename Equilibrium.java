public static int equilibriumPoint(long arr[], int n) {
        if(n==1) return 1;
        long left_sum = 0, sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];  //This will calculates the sum of the array elements.
        }
        for(int i=0;i<n;i++)
        {
            sum -= arr[i];    //calculates right side of the array sum to compare
            if(left_sum == sum) return i+1; //checks for the equilibrium point 
            left_sum +=arr[i];
            
        }return -1;     //returns -1 as if there would be no so called equilibrium point
    }
