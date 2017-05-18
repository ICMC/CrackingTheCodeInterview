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

   for i in range(combSize-1):
       result.insert(i,"")
   listSize = len(bts)
   print(listSize)
   combination(result, bts, listSize, 0)
   return result

def combination(result, bts, listSize, index):

    if(index==listSize):
        return

    for i in bts[index]:
        print(i)
        result[index] =  result[index]+ i
        combination(result, bts, listSize, index+1)
        if(index==0 or index == 1):
            return

buttons = raw_input()
result = pressingButtons(buttons)

for i in range(len(result)-1):
    print(result[i])
