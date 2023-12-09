#include <algorithm>
template <class T> void insertion_sort(T *s[], int n) {
  int i, j;

  for (i = 1; i < n; i++) {
    j = i;
    while ((j > 0) && (s[j] < s[j - 1])) {
      std::swap(s[j], s[j - 1]);
      j = j - 1;
    };
  };
}
