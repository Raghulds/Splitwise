# Splitwise
LLD for Splitwise - A expension tracking application - Java and Spring

User journey & Requirements:

User Management,
Group Creation:
Users should be able to create a new group and become the admin of that group.
The admin can add other users to the group by inviting them through their usernames.
Each group should have a name and an optional description.
Expense Management:
Users should be able to add expenses and specify the amount, description, date, and the participants involved.
Expenses should be categorized into different groups or tags (e.g., "rent," "groceries," "vacation").
Users should be able to view all expenses in a group and filter expenses by category and date range.
Expense Splitting:
When an expense is added, the system should automatically split the amount among the participants equally by default.
Users can manually adjust the amount paid by each participant or specify different split ratios (e.g., uneven splits, percentage splits).
The system should maintain the total balance for each user within the group.
Settlement:
Users should be able to view their balances with each group member, indicating how much they owe or are owed.
The system should provide an option for users to settle their debts with others by recording payments made outside the application.
