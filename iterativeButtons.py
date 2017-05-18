#Given a string of digits, return all of the possible letter combinations that the number could represent.
#

def pressingButtons(buttons):

   btn = { "0": " ","1":"","2": "abc","3": "def","4": "ghi","5": "jkl","6": "mno","7": "pqrs","8": "tuv","9": "wxyz"}

   result = []
   result.insert(0,"")
   aux = []
   k=0
   for i in buttons: # number of buttons tyoed
       for j in result: # times the size of the combination
           letters = btn[i]  # getting the string for each button typed
           for l in letters: # getting each letter of the string and inserting at an auxiliar 
               aux.insert(k, j+l)
               k+=1
       result = aux
       aux = []
       k=0
   return result



buttons = raw_input()
result = pressingButtons(buttons)
k=0
for i in result:
    result[k] = result[k].replace("'",'"')
    k+=1
    print(i)
print(result)
