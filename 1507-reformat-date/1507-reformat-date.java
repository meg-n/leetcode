class Solution {
    public String reformatDate(String date) {
        List<String> months = List.of("", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        String[] parts = date.split(" ");
        StringBuilder sb = new StringBuilder();
        String dates = parts[0].split("[a-z]+")[0];
        sb.append(parts[2]).append('-').append(String.format("%02d", months.indexOf(parts[1]))).append("-").append(String.format("%02d",Integer.parseInt(dates)));
        return sb.toString();
    }
}