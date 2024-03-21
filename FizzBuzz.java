//pesudocode

412. Fizz Buzz List<String> result = new ArrayList<>();
        for(int  i = 1;i <= n; i++)
        { 
            if(i % 15 == 0)
            {
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                result.add("Fizz");
            }
            else if(i % 5 == 0)
            {
                result.add("Buzz");
            }
            else
            result.add(String.valueOf(i));
      
        }
        return result;
T.C - 1ms