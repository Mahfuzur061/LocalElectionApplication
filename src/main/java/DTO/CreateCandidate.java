package DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class CreateCandidate {
    String candidateName;
    int cpr;
}
