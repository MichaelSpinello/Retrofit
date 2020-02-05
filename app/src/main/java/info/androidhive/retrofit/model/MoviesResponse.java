package info.androidhive.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
//branch 2
//Adesso Scrivo benegfdgdfgd

public class MoviesResponse {ggdfg
    @SerializedName("page")
    private int page;
    @Serial
    gf//isdhsduidgaslddondoisdg

    public int getPage() {
        return page;
    }
fgfd
    public void setPage(int page)gfdggthis.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(dggList<Movie> results) {
        this.results = results;
    }
gf
    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
