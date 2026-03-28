import java.util.*;

class PairString {
    String first;
    String second;

    PairString(String first, String second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    // -------- Problem 1: Top N Competitors --------

    public List<String> topNCompetitors(
            int numCompetitors,
            int topNCompetitors,
            List<String> competitors,
            int numReviews,
            List<String> reviews) {

        Set<String> compSet = new HashSet<>();
        Map<String, Integer> freq = new HashMap<>();

        for (String c : competitors)
            compSet.add(c.toLowerCase());

        for (String review : reviews) {

            review = review.toLowerCase();

            String[] words = review.split(" ");

            Set<String> seen = new HashSet<>();

            for (String word : words) {

                word = word.replaceAll("[^a-z]", "");

                if (compSet.contains(word) && !seen.contains(word)) {

                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                    seen.add(word);
                }
            }
        }

        List<String> result = new ArrayList<>(freq.keySet());

        Collections.sort(result, (a, b) -> {

            if (freq.get(a).equals(freq.get(b)))
                return a.compareTo(b);

            return freq.get(b) - freq.get(a);
        });

        if (result.size() > topNCompetitors)
            return result.subList(0, topNCompetitors);

        return result;
    }

    // -------- Problem 2: Largest Item Association --------

    public List<String> LargestItemAssociation(List<PairString> itemAssociation) {

        Map<String, List<String>> graph = new HashMap<>();

        for (PairString p : itemAssociation) {

            graph.putIfAbsent(p.first, new ArrayList<>());
            graph.putIfAbsent(p.second, new ArrayList<>());

            graph.get(p.first).add(p.second);
            graph.get(p.second).add(p.first);
        }

        Set<String> visited = new HashSet<>();
        List<String> bestGroup = new ArrayList<>();

        for (String item : graph.keySet()) {

            if (!visited.contains(item)) {

                List<String> group = new ArrayList<>();

                dfs(item, graph, visited, group);

                Collections.sort(group);

                if (group.size() > bestGroup.size() ||
                        (group.size() == bestGroup.size()
                                && group.get(0).compareTo(bestGroup.get(0)) < 0)) {

                    bestGroup = group;
                }
            }
        }

        return bestGroup;
    }

    private void dfs(String item,
                     Map<String, List<String>> graph,
                     Set<String> visited,
                     List<String> group) {

        visited.add(item);
        group.add(item);

        for (String neighbor : graph.get(item)) {

            if (!visited.contains(neighbor)) {

                dfs(neighbor, graph, visited, group);
            }
        }
    }
}