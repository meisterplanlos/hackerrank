#include <cmath>
#include <cstdio>
#include <map>
#include <iostream>
#include <algorithm>
using namespace std;


int main() 
{
    unsigned int numberOfValues;
    unsigned int value;
    std::cin >> numberOfValues;
    std::map<unsigned int, unsigned int> values;
    
    for(int i = 1; i <= numberOfValues; ++i)
    {
        std::cin >> value;
        values.insert({i, value});
    }
    
    for(int i = 1; i <= numberOfValues; ++i)
    {
        std::cout << values[values[i]] << " " << std::endl;
    }
    
    return 0;
}
