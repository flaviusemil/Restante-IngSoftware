package ro.emanuel.simulare.universitate;

import lombok.Getter;
import lombok.Setter;
import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static ro.emanuel.simulare.universitate.utils.Strings.APPROVAL_ERROR;


@Getter
@Setter
public class Secretariat {

    private static final University university = University.getInstance();
    private List<Student> students = new ArrayList<>();

    public ApprovalResponse sendRequest(Request request) {
        List<Profesor> profesors = university.getProfesors().stream()
                .filter(profesor -> profesor.getType().equals(ProfessorType.PROFESOR))
                .collect(Collectors.toList());

        if (!profesors.isEmpty())
            return profesors.get(0).approve(request);

        return new ApprovalResponse(APPROVAL_ERROR);
    }

}
