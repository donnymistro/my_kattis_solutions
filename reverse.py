"""
This file takes an input that is the number of integer elements,
followed by a stream of elements based on that input and
reverses their order after they are stored into an array.
"""
#Set a counter variable
counter = 0
#Get the input size
inputSize = int(input())
#Create the list
numsList = []
#Populate the list with the remaining numbers
while counter < inputSize:
    newNumber = input()
    numsList.append(newNumber)
    counter += 1
#Finally, print the list in reverse
numsList.reverse()
for number in numsList:
    print(number)
