package run.lifeonline.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HHY
 */
@Data
@NoArgsConstructor
public class BaseRelated<T extends BaseEntity,M extends BaseEntity> {

    private Long id;
    private Long selfId;
    private Long relatedId;

    public BaseRelated(T t, M m) {
        selfId = t.getId();
        relatedId = m.getId();
    }
}
