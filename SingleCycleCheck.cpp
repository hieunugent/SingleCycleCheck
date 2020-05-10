using namespace std;
int getNextIdx(int currentIdx, vector<int> array);
bool hasSingleCycle(vector<int> array) {
  // Write your code here.
	int currentIdx = 0;
	int countStep = 0;
	while (countStep < array.size()){
		if(countStep > 0 && currentIdx == 0) return false;
		countStep++;
		currentIdx = getNextIdx(currentIdx, array);
	}
  return currentIdx ==0;
}

int getNextIdx(int currentIdx, vector<int> array){
	int jumpStep = array[currentIdx];
	int nextIdx = (currentIdx + jumpStep ) % (int)array.size();
	return nextIdx >= 0 ? nextIdx : nextIdx + array.size();
}
