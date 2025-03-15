#include <iostream>
#include <vector>
#include <climits>

using namespace std;

int maxSubarraySum(vector<int>& arr) {
    int maxSum = INT_MIN, currentSum = 0;

    for (int num : arr) {
        currentSum += num;
        maxSum = max(maxSum, currentSum);

        if (currentSum < 0) {
            currentSum = 0;
        }
    }
    
    return maxSum;
}

int main() {
    int n;
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout  << maxSubarraySum(arr) << endl;
    
    return 0;
}
