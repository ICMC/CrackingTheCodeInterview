def pressingButtons(buttons):

   btn = { "0": " ","1":"","2": "abc","3": "def","4": "ghi","5": "jkl","6": "mno","7": "pqrs","8": "tuv","9": "wxyz"}
   bts = []
   result = []
   combSize = 1
   j=0

   for i in buttons:
      bts.insert(j, btn[i])
      combSize = combSize * len(bts[j])
      print(bts[j])
      j +=1

   for i in range(combSize):
       result.insert(i,"")
   listSize = len(bts)
   print(listSize)
   combination(result,listSize, combSize, 0, bts, 0, 0)
   return result


def combination(result, listSize, combSize, index, bts, currElem, innerIndex):

   if(result != 0):
      if(len(result[index])==listSize):
         return

   if(len(bts[currElem])== innerIndex):
       return

   aux = result[index] + bts[currElem][innerIndex]
   if(aux in result):
       return

   result.insert(index, result[index] + bts[currElem][innerIndex])

   combination(result, listSize, combSize, index+1, bts,currElem, innerIndex+1)
   combination(result, listSize, combSize, index, bts, currElem+1, innerIndex-len(bts[currElem]))


  # combination(result,listSize,combSize,index+1,bts,currElem+1,innerIndex)




buttons = raw_input()
result = pressingButtons(buttons)

for i in range(len(result)-1):
    print(result[i])
