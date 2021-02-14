using namespace std;
#include <iostream>
#include <iomanip>
#include <string>
#include <math.h>


//user inputs two options
//people will read these options and give their suggesstions
//most votes to option will result in winner
//display percent of voters voting for option


#define MAX_OPTIONS 2 // max number of options
#define VOTERS 10 //max number of voters

bool vote(string name); //function prototype

//struct
struct opt{
  string option;
  int votes;
};

opt options[MAX_OPTIONS];
int main(void) 
{
  string opt_1;
  string opt_2;
  string choice;
  int voter_count;

  cout << "Write a maximum of 2 options to get voted for\n";
  cout << "Option 1: ";
  cin >> opt_1;
  cout << "Option 2: ";
  cin >> opt_2;
  cin >> voter_count;

  cout << "How many voters will vote? \n";

  string option;

  if (voter_count > 10)
  {
    cout << "Maximum voters allowed are 10. Please enter a digit from 1 to 10";
    return 1;
  }
  else if (voter_count < 1)
  {
    cout << "Positive integer please.";
    return 2;
  }

  cout << "Voters! Go vote for option 1 or 2";
  
  for (int i = 0; i < voter_count; i++)
  {
    cout << "Vote: ";
    cin >> 



  }
  
}

bool vote (string name)
{

}


