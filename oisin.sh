# Test case 1
# Inputs: 50 90
# Expected output: Pass
result="$java grades 50 90"
if [[ $result != "Pass" ]]
then
	echo Test Case 1 Failed
else
	echo Test Case 1 Passed
fi

# Test case 2
# Inputs: 150 90
# Expected output: Invalid Input
result="$java grades 150 50"
if [[ $result != "Invalid Input" ]]
then
	echo Test Case 2 Failed
else
	echo Test Case 2 Passed
fi
