package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntryToCreate);

    TimeEntry find(Long timeEntryId);

    TimeEntry update(Long eq, TimeEntry any);

    void delete(Long timeEntryId);

    List<TimeEntry> list();
}
