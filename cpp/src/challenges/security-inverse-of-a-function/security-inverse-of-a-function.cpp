#include <cmath>
#include <cstdio>
#include <map>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
  unsigned int numberOfValues = 0;
  std::cin >> numberOfValues;
  
  unsigned int value;
  std::map<unsigned int, unsigned int> values;
  for(int i = 1; i <= numberOfValues; ++i)
  {
    std::cin >> value;
    values.insert({value, i});
  }
  
  for(const auto & entry : values)
  {
    std::cout << entry.second << std::endl;
  }
  
  return 0;
}
