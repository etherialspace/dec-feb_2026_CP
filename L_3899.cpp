


#include <iostream>
#include <cmath>
#include <algorithm>

using namespace std;

int main() {
    double a, b, c;
    cin >> a >> b >> c;

    double s = (a + b + c) / 2.0;
    double area = sqrt(s * (s - a) * (s - b) * (s - c));

    if (area <= 0) {
        cout << "[]";
        return 0;
    }

    double angles[3];
    angles[0] = asin((2 * area) / (a * b))*(180.0 / M_PI);
    angles[1] = asin((2 * area) / (b * c))*(180.0 / M_PI);
    angles[2] = asin((2 * area) / (a * c))*(180.0 / M_PI);

    sort(angles, angles + 3);

    cout << "[";
    for (int i = 0; i < 3; i++) {
        cout << angles[i];
        if (i < 2) cout << ", ";
    }
    cout << "]";

    return 0;
}