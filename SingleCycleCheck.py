def hasSingleCycle(array):
    # Write your code here.
	count = 0
	currentIdx = 0
	while count < len(array):
		if count > 0 and currentIdx ==0:
			return False
		count +=1
		currentIdx = getNextIdx(currentIdx, array)
	return currentIdx == 0

def getNextIdx(currentIdx, array):
	jumpStep = array[currentIdx]
	currentIdx = (jumpStep + currentIdx) % len(array)
	return currentIdx if currentIdx >=0 else currentIdx+ len(array)
