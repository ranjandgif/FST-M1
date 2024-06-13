player1=input("enter player1 input")
player2=input("enter player2 input")

print ("provided input :" +player1 )
print ("provided input :" +player2 )

if player1==player2:
       print("its is a tie")
elif player1=='rock' and player2=='scissors':
    print("player1_rock wins" )
elif player2=='rock' and player1=='scissors':
    print("player2_rock wins" )
elif player1=='scissors' and player2=='papers':
     print("player1_Scissors wins" )
elif player2=='scissors' and player1=='papers':
 print("player2_Scissors wins" )
elif player2=='rock' and player1=='papers':
    print("player2_rock wins" )
elif player1=='rock' and player2=='papers':
    print("player1_rock wins" )
    
       










