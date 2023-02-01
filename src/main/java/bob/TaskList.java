package bob;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> list;

    /**
     * Returns a new TaskList object that can be used to interact with the task list
     */
    public TaskList() {
        list = new ArrayList<>();
    }

    // Check if index is in list
    private boolean isInvalidIndex(int index) {
        return index <= 0 || index > list.size();
    }

    /**
     * Adds a given Task object to the list
     * @param t
     */
    public void add(Task t) {
        list.add(t);
    }

    /**
     * Mark the task at the given index
     * @param index Index of task to mark
     * @throws BobException If index is out of range
     */
    public void mark(int index) throws BobException {
        if (isInvalidIndex(index)) {
            String error = String.format("Index given should be in range [1-%s]", list.size());
            throw new BobException(error);
        }

        // Since list is 0-indexed
        list.get(index - 1).mark();
    }

    /**
     * Unmark the task at the given index
     * @param index Index of task to unmark
     * @throws BobException If index is out of range
     */
    public void unmark(int index) throws BobException {
        if (isInvalidIndex(index)) {
            String error = String.format("Index given should be in range [1-%s]", list.size());
            throw new BobException(error);
        }

        // Since list is 0-indexed
        list.get(index - 1).unmark();
    }

    /**
     * Delete the task at the given index
     * @param index Index of task to delete
     * @throws BobException If index is out of range
     */
    public Task delete(int index) throws BobException {
        if (isInvalidIndex(index)) {
            String error = String.format("Index given should be in range [1-%s]", list.size());
            throw new BobException(error);
        }

        // Since list is 0-indexed
        return list.remove(index - 1);
    }

    /**
     * Returns the task at the given index
     * @param index Index of task to return
     * @return Task at the given index
     * @throws BobException If index is out of range
     */
    public Task get(int index) throws BobException {
        if (isInvalidIndex(index)) {
            String error = String.format("Index given should be in range [1-%s]", list.size());
            throw new BobException(error);
        }

        // Since list is 0-indexed
        return list.get(index - 1);
    }

    public ArrayList<Task> getList() {
        return this.list;
    }
}
