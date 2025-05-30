# EagleAIPartnerWithUs
Partner With Us backend 

# Updates
- 30th May, 2025 : Made entities Business Details, PartnerLead, PrimaryContact, SalonInfo
- When a salon owner or manager opens the “Partner With Us” form, they’ll fill out fields like:
Salon Info:
name, branch number, city, average monthly footfall, client type (walk-in, appointment, etc.)
Primary Contact:
name, email, phone, designation (manager, owner, etc.)
Business Detail:
business type, GSTIN
The form may also internally capture the source (e.g., "website", "campaign", "app" etc.)
📤 Frontend Sends:
All this data will be bundled into one PartnerLeadRequest and sent to the backend via a POST API.
