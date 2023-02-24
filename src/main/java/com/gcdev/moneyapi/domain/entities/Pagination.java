package com.gcdev.moneyapi.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

@Data
@NoArgsConstructor
@JsonComponent
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pagination {

    @JsonProperty("offset")
    private int offset;
    @JsonProperty("total")
    private int total;
}