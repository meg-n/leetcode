class Solution {
    public class Transaction{
        String name;
        int amt;
        int time;
        String city;
        Transaction(){}
        Transaction(String name, int time, int amt, String city){
            this.name = name;
            this.amt = amt;
            this.time = time;
            this.city = city;
        }
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> list = new ArrayList<>();
        Map<String, List<Transaction>> map = new HashMap<>();
        for(String tx : transactions){
            String[] tArr = tx.split(",");
            Transaction t = new Transaction(tArr[0], Integer.parseInt(tArr[1]), Integer.parseInt(tArr[2]), tArr[3]);
            map.putIfAbsent(t.name,new ArrayList<>());
            map.get(t.name).add(t);
            
        }
        System.out.println(map.size());
        for(String tx : transactions){
            String[] tArr = tx.split(",");
            Transaction t = new Transaction(tArr[0], Integer.parseInt(tArr[1]), Integer.parseInt(tArr[2]), tArr[3]);
            if(isAbove(tx) || checkTime(t,map.getOrDefault(t.name,new ArrayList<>()))){
                list.add(tx);
            }
        }
        return list;
    }
    public boolean isAbove(String tx){
        int amt = Integer.parseInt(tx.split(",")[2]);
        return amt > 1000;
    }
    public boolean checkTime(Transaction t, List<Transaction> list){
        for(Transaction h : list){
            if(Math.abs(t.time - h.time)<=60 && !t.city.equals(h.city))
                return true;
        }      
        return false;
    }
}