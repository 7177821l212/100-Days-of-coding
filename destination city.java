//destination city;
//pesudocode
int length = paths.size();
HashSet<String> set = new HashSet<>();
for(int i = 0; i < length; i++)
{
set.add(paths.get(i).get(0));
}
for(int i = 0;i < length; i++)
{
if(!set.contains(paths.get(i).get(1))
{
return paths.get(i).get(1));
}
}
return "";