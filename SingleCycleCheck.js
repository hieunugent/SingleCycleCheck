function hasSingleCycle(array) {
  // Write your code here.
	let currentIdx = 0;
	let countStep = 0;
	while(countStep < array.length){
		if(countStep > 0 && currentIdx == 0) return false;
		countStep++;
		currentIdx = getNextIdx(currentIdx, array);
	}
	return currentIdx ==0;
	
}
function getNextIdx(currentIdx, array){
	let jumpStep = array[currentIdx];
	let nextIdx = (currentIdx+jumpStep) % array.length;
	return nextIdx >=0 ? nextIdx : nextIdx + array.length;
	
}

// Do not edit the line below.
exports.hasSingleCycle = hasSingleCycle;
