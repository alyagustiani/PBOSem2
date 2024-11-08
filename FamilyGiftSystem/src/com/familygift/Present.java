package com.familygift;

import java.util.*;

class Present {
    private final Uncle giver;
    private final Niece recipient;
    private final String description;

    public Present(Uncle giver, Niece recipient, String description) {
        this.giver = giver;
        this.recipient = recipient;
        this.description = description;
    }

    public Uncle getGiver() { return giver; }
    public Niece getRecipient() { return recipient; }
    public String getDescription() { return description; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Present present = (Present) o;
        return Objects.equals(description, present.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
