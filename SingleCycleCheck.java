class SingleCycleCheck{
  public static boolean hasSingleCycle(int[] array) {
    // Write your code here.
		int count = 0;
		int currentIdx = 0;
		while (count < array.length){
			if (count > 0 && currentIdx == 0) return false;
			currentIdx = getNextmove(currentIdx, array);
			count++;
		}
    return currentIdx == 0;
  }
	public static int getNextmove(int currentIdx, int  [] array){
		int jump = array[currentIdx];
		return wrapAround(array.length, jump + currentIdx);
		
	}
	public static int wrapAround(int len, int currentMove){
		int resultMove = currentMove % len;
		return  resultMove >= 0 ? resultMove : resultMove + len;
	}

}
