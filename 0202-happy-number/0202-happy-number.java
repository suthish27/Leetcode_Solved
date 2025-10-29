class Solution {
    public boolean isHappy(int n) {
        	int temp = n;
		Set<Integer> set = new HashSet<>();
		
		while (n != 1 && !set.contains(n)) {
		    set.add(n);
		    int res = 0;
		    while (n != 0) {
		        int digit = n % 10;
		        res += digit * digit;
		        n /= 10;
		    }
		    n = res;
		}
		
		if (n == 1)return true;
		 return false;
	
    }
}