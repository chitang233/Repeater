#include <iostream>
using namespace std;

void repeater(string inputText, int inputTimes)
{
  for(int a = 0; a < inputTimes; a++)
  {
    cout << inputText << endl;
  }
}

int main()
{
  int inputTimes;
  string inputText;
  cout << "iNpUt SoMe AwEsOmE tExTs PlEaSe: ";
  cin >> inputText;
  cout << "hOw MaNy TiMeS dO yOu WaNt To RePeAt: ";
  cin >> inputTimes;
  repeater(inputText, inputTimes);
}