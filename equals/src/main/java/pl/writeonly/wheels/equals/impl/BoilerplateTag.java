package pl.writeonly.wheels.equals.impl;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import pl.writeonly.wheels.equals.api.BoilerplateEqable;

public class BoilerplateTag implements BoilerplateEqable<BoilerplateTag> {
    private final String name;
    private final int count;

    public BoilerplateTag(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object other) {
        return defaultEquals(other);
    }


    @Override
    public boolean eq(BoilerplateTag that) {
        return Objects.equal(name, that.name) && Objects.equal(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, count);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("count", count)
                .toString();
    }
}