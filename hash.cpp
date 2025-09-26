#include <unordered_map>
std::unordered_map<std::string, int> hash_table;
hash_table["Alice"] = 25;
int value = hash_table["Alice"];  // 25
