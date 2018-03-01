#include<iostream>
#include<vector>
using namespace std;
main()
{
vector<vector<int> > matrix{ { 0, 2, 3 },
                             { 4, 0, 0 },
                             { 1, 8, 9 } };
long int sum=0;
    for(int i=0;i<matrix.size();i++)
    {
        for(int j=0;j<matrix[i].size();j++)
        {
           if(matrix[i][j]!=0)
           {
               sum+=matrix[i][j];
           }
            if(matrix[i][j]==0)
            {
                for(int k=i;k<matrix.size();k++)
                {
                    matrix[k][j]==0;
                }
            }
    }
  }
  cout<<sum;
}
